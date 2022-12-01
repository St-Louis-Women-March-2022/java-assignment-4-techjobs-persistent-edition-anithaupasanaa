package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Name is required.")
    @Size(max = 100, message = "Location must be under 100 characters.")
    public String location;
    @JoinColumn(name = "employer_id")
    @OneToMany
   // private final List<Job> jobs = new ArrayList<>();
     private List<Job> jobs=new ArrayList<>();

    public Employer() {
    }

    public Employer(String location) {
        super();
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}
