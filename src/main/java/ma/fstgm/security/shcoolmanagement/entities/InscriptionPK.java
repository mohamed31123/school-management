package ma.fstgm.security.shcoolmanagement.entities;


import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Getter
@Setter
public class InscriptionPK implements Serializable {
    private Long idEtudiant ;
    private Long idCours ;

    public InscriptionPK(){}

    public InscriptionPK(Long idEtudiant, Long idCours){
        this.idEtudiant = idEtudiant;
        this.idCours = idCours;
    }

}
