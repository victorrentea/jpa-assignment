package victor.training.jpa.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
public class ErrorComment {
   @Id
   @GeneratedValue
   private Long id;
   private String text;

   public ErrorComment(String text) {
      this.text = text;
   }
}
