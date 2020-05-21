package fr.watchdogs.benjaminloison.driveables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import net.minecraft.item.ItemStack;

public class PartType extends InfoType
{
    public int RFDrawRate = 1, category, fuel = 0, stackSize;
    public float engineSpeed = 1, fuelConsumption = 1;
    public List<EnumType> worksWith = Arrays.asList(EnumType.mecha, EnumType.plane, EnumType.vehicle);
    public ArrayList<ItemStack> partBoxRecipe = new ArrayList<ItemStack>();
    public boolean useRFPower = false;
    public static HashMap<EnumType, PartType> defaultEngines = new HashMap<EnumType, PartType>();
    public static List<PartType> parts = new ArrayList<PartType>();

    public PartType(TypeFile file)
    {
        super(file);
        parts.add(this);
    }

    @Override
    public void postRead(TypeFile file)
    {
        if(category == 2 && !useRFPower)
            for(EnumType type : worksWith)
                if(defaultEngines.containsKey(type) && isInferiorEngine(defaultEngines.get(type)))
                    defaultEngines.put(type, this);
                else
                    defaultEngines.put(type, this);
    }

    @Override
    protected void read(String[] split, TypeFile file)
    {
        super.read(split, file);
        try
        {
            if(split[0].equals("Category"))
                category = getCategory(split[1]);
            else if(split[0].equals("StackSize"))
                stackSize = Integer.parseInt(split[1]);
            else if(split[0].equals("EngineSpeed"))
                engineSpeed = Float.parseFloat(split[1]);
            else if(split[0].equals("FuelConsumption"))
                fuelConsumption = Float.parseFloat(split[1]);
            else if(split[0].equals("Fuel"))
                fuel = Integer.parseInt(split[1]);
            else if(split[0].equals("PartBoxRecipe"))
            {
                ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
                for(int i = 0; i < (split.length - 2) / 2; i++)
                {
                    int amount = Integer.parseInt(split[2 * i + 2]);
                    boolean damaged = split[2 * i + 3].contains(".");
                    String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
                    int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
                    stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
                }
                partBoxRecipe.addAll(Arrays.asList(stacks));
            }
            else if(split[0].equals("WorksWith"))
            {
                worksWith = new ArrayList<EnumType>();
                for(int i = 0; i < split.length - 1; i++)
                    worksWith.add(EnumType.get(split[i + 1]));
            }
            else if(split[0].equals("UseRF") || split[0].equals("UseRFPower"))
                useRFPower = Boolean.parseBoolean(split[1]);
            else if(split[0].equals("RFDrawRate"))
                RFDrawRate = Integer.parseInt(split[1]);
        }
        catch(Exception e)
        {
            System.out.println("Reading part file failed.");
            e.printStackTrace();
        }
    }

    public boolean isInferiorEngine(PartType quitePossiblyAnInferiorEngine)
    {
        return engineSpeed > quitePossiblyAnInferiorEngine.engineSpeed;
    }

    public static PartType getPart(String s)
    {
        for(PartType part : parts)
            if(part.shortName.equals(s))
                return part;
        return null;
    }

    private int getCategory(String s)
    {
        if(s.equals("Cockpit"))
            return 0;
        else if(s.equals("Wing"))
            return 1;
        else if(s.equals("Engine"))
            return 2;
        else if(s.equals("Propeller"))
            return 3;
        else if(s.equals("Bay"))
            return 4;
        else if(s.equals("Tail"))
            return 5;
        else if(s.equals("Wheel"))
            return 6;
        else if(s.equals("Chassis"))
            return 7;
        else if(s.equals("Turret"))
            return 8;
        else if(s.equals("Fuel"))
            return 9;
        else if(s.equals("Misc"))
            return 10;
        return 10;
    }
}