package com.company;

//create class called Players
public class Players {

    //Create properties: id, name, team name, DOB, & appearances.
    private int id = 0;
    private String name = "no name";
    private String teamName = "no team";
    private String dateOfBirth = "no dob";
    private String[] appearances;

    // getters and setters for each property
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getTeamName()
    {
        return teamName;
    }
    public void setTeamName(String teamName)
    {
        this.teamName = teamName;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String[] getAppearances()
    {
        return appearances;
    }
    public void setName(String[] appearances)
    {
        this.appearances = appearances;
    }

    //setter for all properties
    public void setAll(int id, String name, String teamName, String dateOfBirth, String[] appearances)
    {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.dateOfBirth = dateOfBirth;
        this.appearances = appearances;
    }

    // constructor with 5+ overloads
    public Players()
    {
    }
    public Players (int id)
    {
        this.id = id;
    }
    public Players (int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public Players (int id, String name, String teamName)
    {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
    }
    public Players (int id, String name, String teamName, String dateOfBirth)
    {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.dateOfBirth = dateOfBirth;
    }
    public Players (int id, String name, String teamName, String dateOfBirth, String[]appearances)
    {
        this.id = id;
        this.name = name;
        this.teamName = teamName;
        this.dateOfBirth = dateOfBirth;
        this.appearances = appearances;
    }
}
