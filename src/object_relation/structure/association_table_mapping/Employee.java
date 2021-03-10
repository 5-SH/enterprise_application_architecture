package object_relation.structure.association_table_mapping;

import java.util.ArrayList;
import java.util.List;

public class Employee extends DomainObject {
  private String name;
  private List<Skill> skills;

  public Employee(Long id, String name) {
    super(id);
    this.name = name;
    this.skills = new ArrayList<>();
  }

  public Employee(Long id, String name, List<Skill> skills) {
    super(id);
    this.name = name;
    this.skills = skills;
  }

  public void addSkill(Skill arg) {
    skills.add(arg);
  }

  public void removeSkill(Skill arg) {
    skills.remove(arg);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", skills=" + skills +
      '}';
  }
}
