package net.cyrus;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "POINTS")
@Data
public class Point implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "x", nullable = false)
    private double x;
    @Column(name = "y", nullable = false)
    private double y;
    @Column(name = "r", nullable = false)
    private double r;
    @Column(name = "result", nullable = false)
    private String result;
    @Column(name = "date", nullable = false)
    private Timestamp date = new Timestamp(new Date().getTime());
}



