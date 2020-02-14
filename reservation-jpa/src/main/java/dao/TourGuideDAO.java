package dao;

import domain.TourGuide;

public class TourGuideDAO extends DAO<TourGuide>{

    @Override
    protected String getSqlString() {
        return "select m from guia m";
    }

    @Override
    protected Class getClassName() {
        return TourGuide.class;
    }
}
