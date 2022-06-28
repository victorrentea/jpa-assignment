package victor.training.jpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter

public class ErrorLog {
   private Long id;

   private String message;

   private List<ErrorComment> comments = new ArrayList<>();

   private Set<ErrorTag> tags = new HashSet<>();

   public ErrorLog() {
   }

   public ErrorLog(String message) {
      this.message = message;
   }



}
