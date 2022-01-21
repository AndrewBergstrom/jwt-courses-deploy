package com.example.jfs_jwt.model;

public class Course {
   private final String id;
   private final String name;
   private final String objectives;

   public Course(String id, String name, String objectives) {
      this.id = id;
      this.name = name;
      this.objectives = objectives;
   }

   public String getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public String getObjectives() {
      return objectives;
   }

   @Override
   public String toString() {
      return "Course{" +
              "id='" + id + '\'' +
              ", name='" + name + '\'' +
              ", objectives='" + objectives + '\'' +
              '}';
   }
}
