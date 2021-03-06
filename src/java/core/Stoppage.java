/*
 * Feel free to edit, copy and reuse the resources
 * available in this project, unless you are going to use autogenerated
 * code where different licences might apply. It is your responsibility
 * to ensure that you posses the right to modify, copy or reuse such 
 * resources.
 */
package core;

/**
 * This class represents stoppage that
 * occurs within production line.
 * @author Lukas
 */
public class Stoppage
{

    private String stoppageID;
    private String lineID;
    private String areaID;
    private String startTime;
    private String endTime;
    private String duration;
    private String description;
    private int occurencies;
    private String solution;

    /**
     * This constructor allows initiation of the new stoppage for the area of
     * production line.
     *
     * @param sid ID of the stoppage
     * @param lid ID of the line for which stoppage occurs
     * @param aid ID of the area where the stoppage occurs
     * @param start start time of the stoppage
     */
    public Stoppage(String sid, String lid, String aid, String start)
    {
        this.stoppageID = sid;
        this.lineID = lid;
        this.areaID = aid;
        this.startTime = start;
    }

    /**
     * Zero argument constructor that
     * assign the default values for
     * all of the attributes
     */
    public Stoppage()
    {
        this.stoppageID = "";
        this.lineID = "";
        this.areaID = "";
        this.startTime = "";
        this.endTime = "";
        this.duration = "";
        this.description = "";
        this.occurencies = 1;
        this.solution = "";
    }

    public String getStoppageID()
    {
        return stoppageID;
    }

    public void setStoppageID(String stoppageID)
    {
        this.stoppageID = stoppageID;
    }

    public String getLineID()
    {
        return lineID;
    }

    public void setLineID(String lineID)
    {
        this.lineID = lineID;
    }

    public String getAreaID()
    {
        return areaID;
    }

    public void setAreaID(String areaID)
    {
        this.areaID = areaID;
    }

    public String getStartTime()
    {
        return startTime;
    }

    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }

    public String getEndTime()
    {
        return endTime;
    }

    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }

    public String getDuration()
    {
        return duration;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getOccurencies()
    {
        return occurencies;
    }

    public void setOccurencies(int occurencies)
    {
        this.occurencies = occurencies;
    }

    public String getSolution()
    {
        return solution;
    }

    public void setSolution(String solution)
    {
        this.solution = solution;
    }

}
