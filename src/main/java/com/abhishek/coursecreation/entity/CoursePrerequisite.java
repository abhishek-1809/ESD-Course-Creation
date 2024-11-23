package com.abhishek.coursecreation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course_prerequisite")
public class CoursePrerequisite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
//    @JoinColumn(name = "course_id", referencedColumnName = "course_id", nullable = true)
    @JoinColumn(name = "course_id")
    private Courses courseId;

    @ManyToOne
    @JoinColumn(name = "prerequisite")
    private Courses prerequisite;

    @Lob
    @Column(name = "description")
    private String description;
}