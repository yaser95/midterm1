package com.cisc181.core;

import java.util.UUID;

public class Section {
    private UUID SectionID;
    
    private UUID CourseID;
    private UUID SemesterID;
    private int RoomID;
    
    public Section(UUID courseID, UUID semesterID, int roomID) {
        SectionID = UUID.randomUUID();
        CourseID = courseID;
        SemesterID = semesterID;
        RoomID = roomID;
    }
    
    public UUID getSectionID() {
        return SectionID;
    }
    
    public UUID getCourseID() {
        return CourseID;
    }
    
    public UUID getSemesterID() {
        return SemesterID;
    }
    
    public int getRoomID() {
        return RoomID;
    }
    
}
