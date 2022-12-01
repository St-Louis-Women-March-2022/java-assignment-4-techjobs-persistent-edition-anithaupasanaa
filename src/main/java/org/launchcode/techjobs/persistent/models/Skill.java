package org.launchcode.techjobs.persistent.models;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
@Entity
public class Skill extends AbstractEntity {
 @NotBlank(message = "Name is required.")
 @Size(max = 100, message = "Location must be under 100 characters.")
  public String description;
 @ManyToMany(mappedBy = "skills")
 private final List<Job> jobs=new ArrayList<>();
 public Skill(String description){
  this.description=description;
 }
 public Skill(){}
 public List<Job> getJobs(){return jobs;}
 public String getDescription(){
  return description;
 }
 public void setDescription(String description){
  this.description=description;
 }

}