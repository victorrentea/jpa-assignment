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

public class ErrorTag {
   private Long id;
   private String label;

   public ErrorTag(String label) {
      this.label = label;
   }
}
