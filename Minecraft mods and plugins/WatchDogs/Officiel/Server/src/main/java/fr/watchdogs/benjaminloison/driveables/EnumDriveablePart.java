package fr.watchdogs.benjaminloison.driveables;

import java.util.ArrayList;

public enum EnumDriveablePart
{
    tailWheel(new EnumDriveablePart[] {}, "tailWheel", "Wheel (Tail)"),
    tail(new EnumDriveablePart[] {tailWheel}, "tail", "Tail"),
    bay(new EnumDriveablePart[] {tail}, "bay", "Bay"),
    topWing(new EnumDriveablePart[] {}, "topWing", "Top Wing"),
    leftWingWheel(new EnumDriveablePart[] {}, "leftWingWheel", "Wheel (Left Wing)"),
    leftWing(new EnumDriveablePart[] {topWing, leftWingWheel}, "leftWing", "Left Wing"),
    rightWingWheel(new EnumDriveablePart[] {}, "rightWingWheel", "Wheel (Right Wing)"),
    rightWing(new EnumDriveablePart[] {topWing, rightWingWheel}, "rightWing", "Right Wing"),
    nose(new EnumDriveablePart[] {}, "nose", "Nose"),
    coreWheel(new EnumDriveablePart[] {}, "coreWheel", "Wheel (Core)"),
    skids(new EnumDriveablePart[] {}, "skids", "Skids"),
    blades(new EnumDriveablePart[] {}, "blades", "Blades"),
    turret(new EnumDriveablePart[] {}, "turret", "Turret"),
    backWheel(new EnumDriveablePart[] {}, "backWheel", "Back Wheel"),
    frontWheel(new EnumDriveablePart[] {}, "frontWheel", "Front Wheel"),
    backLeftWheel(new EnumDriveablePart[] {}, "backLeftWheel", "Back Left Wheel"),
    frontLeftWheel(new EnumDriveablePart[] {}, "frontLeftWheel", "Front Left Wheel"),
    backRightWheel(new EnumDriveablePart[] {}, "backRightWheel", "Back Right Wheel"),
    frontRightWheel(new EnumDriveablePart[] {}, "frontRightWheel", "Front Right Wheel"),
    leftTrack(new EnumDriveablePart[] {}, "leftTrack", "Left Track"),
    rightTrack(new EnumDriveablePart[] {}, "rightTrack", "Right Track"),
    trailer(new EnumDriveablePart[] {}, "trailer", "Trailer"),
    harvester(new EnumDriveablePart[] {}, "harvester", "Harvester"),
    leftArm(new EnumDriveablePart[] {}, "leftArm", "Left Arm"),
    rightArm(new EnumDriveablePart[] {}, "rightArm", "Right Arm"),
    head(new EnumDriveablePart[] {}, "head", "Head"),
    hips(new EnumDriveablePart[] {}, "hips", "Hips"),
    barrel(new EnumDriveablePart[] {}, "barrel", "Barrel"),
    core(new EnumDriveablePart[] {bay, leftWing, rightWing, nose, turret, coreWheel, leftArm, rightArm, head, hips, blades, skids, backWheel, frontWheel, backLeftWheel, frontLeftWheel, backRightWheel, frontRightWheel, leftTrack, rightTrack, trailer, harvester}, "core", "Core");
    private String shortName, name;
    private EnumDriveablePart[] children;

    private EnumDriveablePart(EnumDriveablePart[] parts, String s, String s2)
    {
        children = parts;
        shortName = s;
        name = s2;
    }

    public EnumDriveablePart[] getChildren()
    {
        return children;
    }

    public EnumDriveablePart[] getParents()
    {
        ArrayList<EnumDriveablePart> parents = new ArrayList<EnumDriveablePart>();
        for(EnumDriveablePart part : values())
            for(EnumDriveablePart childPart : part.getChildren())
                if(childPart == this)
                    parents.add(part);
        return parents.toArray(new EnumDriveablePart[parents.size()]);
    }

    public String getShortName()
    {
        return shortName;
    }

    public String getName()
    {
        return name;
    }

    public static EnumDriveablePart getPart(String s)
    {
        for(EnumDriveablePart part : values())
            if(part.getShortName().equals(s))
                return part;
        return null;
    }

    public static boolean isWheel(EnumDriveablePart part)
    {
        return part == coreWheel || part == tailWheel || part == leftWingWheel || part == rightWingWheel;
    }
}