package msapi.microserviceemail.models;


import jakarta.persistence.*;
import lombok.Data;
import msapi.microserviceemail.enums.StatusEmail;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID emailId;
    private String ownerRef;  //referencia do proprietario do email -> o ID de que enviar o email
    private String emailFrom;  //de quem esta enviando
    private String emailTo;  //para quem sera enviado o email
    private String subject; //titulo do email
    @Column(columnDefinition = "TEXT")  //corpo do email
    private String text;
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;  //status do email ser foi enviado
}