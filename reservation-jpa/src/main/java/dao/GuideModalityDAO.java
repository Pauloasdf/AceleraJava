package dao;

import domain.GuideModality;
import domain.Modality;

public class GuideModalityDAO extends DAO<GuideModality>{

    @Override
    protected String getSqlString() {
        return "select m from guia_modalidade m";
    }

    @Override
    protected Class getClassName() {
        return Modality.class;
    }
}
