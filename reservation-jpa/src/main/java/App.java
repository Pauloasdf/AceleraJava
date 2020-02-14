import dao.GuideModalityDAO;
import dao.ModalityDAO;
import dao.TourGuideDAO;
import dao.TourTypeDAO;
import domain.GuideModality;
import domain.Modality;
import domain.TourGuide;
import domain.TourType;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Modality modality = new Modality("Caminhada");
        ModalityDAO modalityDAO = new ModalityDAO();
        modalityDAO.save(modality);

//        TourTypeDAO tourTypeDAO = new TourTypeDAO();
//        TourType tourType = new TourType("Privativo");
//        tourTypeDAO.save(tourType);
//        List<Modality> modalities = modalityDAO.listarTodos();
//        for (Modality domain : modalities) {
//            System.out.println(domain.getId() + " / " + domain.getNome());
//        }

        TourGuide tourGuide = new TourGuide("André Souza");
        TourGuideDAO tourGuideDAO = new TourGuideDAO();
        tourGuideDAO.save(tourGuide);

        GuideModalityDAO guideModalityDAO = new GuideModalityDAO();
        guideModalityDAO.save( new GuideModality(tourGuide,modality));
    }

}
