package com.minefus.degraduck.gui;

import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class MinefusInventoryPlayer implements IInventory
{
    private static final String TAG_NAME = "MinefusInv";
    public static final int INV_SIZE = 64;
    private ItemStack[] inventory = new ItemStack[64];

    public int getSizeInventory()
    {
        return inventory.length;
    }

    public ItemStack getStackInSlot(int slot)
    {
        return inventory[slot];
    }

    public ItemStack decrStackSize(int slot, int amount)
    {
        ItemStack stack = getStackInSlot(slot);
        if(stack != null)
        {
            if(stack.stackSize > amount)
            {
                stack = stack.splitStack(amount);
                if(stack.stackSize == 0)
                    setInventorySlotContents(slot, null);
            }
            else
                setInventorySlotContents(slot, null);
            markDirty();
        }
        return stack;
    }

    public ItemStack getStackInSlotOnClosing(int slot)
    {
        ItemStack stack = getStackInSlot(slot);
        if(stack != null)
            setInventorySlotContents(slot, null);
        return stack;
    }

    public void setInventorySlotContents(int slot, ItemStack itemstack)
    {
        inventory[slot] = itemstack;
        if((itemstack != null) && (itemstack.stackSize > getInventoryStackLimit()))
            itemstack.stackSize = getInventoryStackLimit();
        markDirty();
    }

    public String getInventoryName()
    {
        return I18n.format("minefus_inventory");
    }

    public int getInventoryStackLimit()
    {
        return 64;
    }

    public void markDirty()
    {
        for(int i = 0; i < getSizeInventory(); i++)
            if(getStackInSlot(i) != null)
                setInventorySlotContents(i, null);
    }

    public boolean isUseableByPlayer(EntityPlayer entityplayer)
    {
        return true;
    }

    public boolean isItemValidForSlot(int slot, ItemStack itemstack)
    {
        return true;
    }

    public void writeToNBT(NBTTagCompound compound)
    {
        NBTTagList items = new NBTTagList();
        for(int i = 0; i < getSizeInventory(); i++)
            if(getStackInSlot(i) != null)
            {
                NBTTagCompound item = new NBTTagCompound();
                item.setByte("Slot", (byte)i);
                getStackInSlot(i).writeToNBT(item);
                items.appendTag(item);
            }
        compound.setTag(TAG_NAME, items);
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        NBTTagList items = compound.getTagList(TAG_NAME, compound.getId());
        for(int i = 0; i < items.tagCount(); i++)
        {
            NBTTagCompound item = items.getCompoundTagAt(i);
            byte slot = item.getByte("Slot");
            if((slot >= 0) && (slot < getSizeInventory()))
                inventory[slot] = ItemStack.loadItemStackFromNBT(item);
        }
    }

    public void openInventory()
    {}

    public void closeInventory()
    {}

    @Override
    public boolean hasCustomInventoryName()
    {
        return true;
    }
}