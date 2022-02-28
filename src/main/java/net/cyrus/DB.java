package net.cyrus;

import javax.annotation.Resource;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;
import java.util.List;

@ManagedBean(name = "dataBase")
@ApplicationScoped
public class DB {
    private static final String PERSISTENCE_UNIT_NAME = "postgres";

    @PersistenceContext(unitName = PERSISTENCE_UNIT_NAME)
    private EntityManager entityManager;

    @Resource
    private UserTransaction userTransaction;

    public List<Point> loadPoints() {
        return  entityManager.createQuery("SELECT e FROM Point e").getResultList();
    }

    public synchronized void addPointToDB(Point point) throws Exception {
        userTransaction.begin();
        entityManager.persist(point);
        userTransaction.commit();
    }

}