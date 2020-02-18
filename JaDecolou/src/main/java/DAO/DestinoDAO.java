package DAO;

import domain.BaseEntity;
import domain.Destino;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(
        name = "destino"
)
class DestinoDao extends DAO<BaseEntity> {

    public DestinoDao(){}

    protected String getSqlString() {
        return "select m from destino m";
    }

    protected Class getClassName() {
        return Destino.class;
    }

}