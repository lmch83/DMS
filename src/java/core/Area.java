/*
 * Feel free to edit, copy and reuse the resources
 * available in this project, unless you are going to use autogenerated
 * code where different licences might apply. It is your responsibility
 * to ensure that you posses the right to modify, copy or reuse such 
 * resources.
 */
package core;

import utilities.AreaIDs;
import utilities.AreaNames;

/**
 * This class is not yet used.
 * The necessity for this class is still
 * to be considered.
 * @author Lukasz Chlodnicki
 */
public class Area
{

    private AreaIDs areaID;
    private String lineID;
    private AreaNames name;

    /**
     * Three argument constructor for
     * the area of production line
     * @param arid the id of the area
     * @param lid the id of the line
     * @param an the name of the area
     */
    public Area(AreaIDs arid, String lid, AreaNames an)
    {
        this.areaID = arid;
        this.lineID = lid;
        this.name = an;
    }

    public AreaIDs getAreaID()
    {
        return areaID;
    }

    public void setAreaID(AreaIDs areaID)
    {
        this.areaID = areaID;
    }

    public String getLineID()
    {
        return lineID;
    }

    public void setLineID(String lineID)
    {
        this.lineID = lineID;
    }

    public AreaNames getName()
    {
        return name;
    }

    public void setName(AreaNames name)
    {
        this.name = name;
    }
    
    
}