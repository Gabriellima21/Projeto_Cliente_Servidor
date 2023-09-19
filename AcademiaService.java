package br.com.unicsul.ads.service;

import br.com.unicsul.ads.controller.AcademiaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcademiaService {
    public String rotaExercicioComParametro( Integer id){
        if (id == 1) {
            return "supino";
        } else {
            return "exercicio_não encontrado!";
        }
    }
}
