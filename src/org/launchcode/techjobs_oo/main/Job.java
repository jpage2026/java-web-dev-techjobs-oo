package org.launchcode.techjobs_oo.main;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id &&
                Objects.equals(name, job.name) &&
                Objects.equals(employer, job.employer) &&
                Objects.equals(location, job.location) &&
                Objects.equals(positionType, job.positionType) &&
                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.equals("") || name.equals(null)){
            this.name = "Data Not Available";
        }
        else{
            this.name = name;
        }
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        if(employer.equals("") || employer.equals(null)){
            employer.setValue("Data Not Available");
        }
        else{
            this.employer = employer;
        }
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        if(location.equals("") || location.equals(null)){
            location.setValue("Data Not Available");
        }
        else{
            this.location = location;
        }
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        if(positionType.equals("") || positionType.equals(null)){
            positionType.setValue("Data Not Available");
        }
        else{
            this.positionType = positionType;
        }
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        if(coreCompetency.equals("") || coreCompetency.equals(null)){
            coreCompetency.setValue("Data Not Available");
        }
        else{
            this.coreCompetency = coreCompetency;
        }
    }
    @Override
    public String toString() {
//        public void setID()
//        if(getId() == 0){
//            this.getId() = "Data Not Available";
//        }
//        if(getEmployer() == null || getEmployer().equals("")){
//            return "Employer: Data Not Available";
//        }
//        if(getLocation() == null || getLocation().equals("")){
//            return "Location: Data Not Available";
//        }
//        if(getPositionType() == null || getPositionType().equals(" ")){
//            return "PositionType: Data Not Available";
//        }
//        if(getCoreCompetency() == null || getCoreCompetency().equals("  ")){
//            return"Core Competency: Data Not Available";
//        }
//        else {
            return "\n Id:" + getId() + "\n Employer:" + getEmployer() + "\n Location:" + getLocation() + "\n Position:" + getPositionType() +
                    "\n Core Competency:" + getCoreCompetency() + "\n";
        }



}
