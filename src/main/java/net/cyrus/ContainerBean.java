package net.cyrus;

import lombok.Data;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@ManagedBean(name = "containerBean")
@ApplicationScoped
public class ContainerBean implements Serializable {

    @ManagedProperty(value = "#{dataBase}")
    private DB DBManager;
    private Point point = new Point();

    private List<Point> points = new ArrayList<>();

    @PostConstruct
    private void loadPoints() {
        points = DBManager.loadPoints();
    }

    public void addPoint() throws Exception {
        HitChecker.checkHit(point);
        points.add(point);
        DBManager.addPointToDB(point);
        point = new Point();
    }
}