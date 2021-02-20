package builder;

import java.time.LocalDate;
import java.util.*;

public class Pearson {

    private String name;
    private LocalDate birthDate;
    private List<String> nameParents;
    private Map<String, String> documents;

    public Pearson(Builder builder) {
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.nameParents = builder.nameParents;
        this.documents = builder.documents;
    }

    public static class Builder {

        private String name;
        private LocalDate birthDate;
        private List<String> nameParents;
        private Map<String, String> documents;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder birthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder addNameParents(String... parents) {
            if (nameParents == null) {
                this.nameParents = new ArrayList<>();
            }
            this.nameParents.addAll(Arrays.asList(parents));
            return this;
        }

        public Builder addDocument(String documentName, String documentValue) {
            if (documents == null) {
                documents = new HashMap<>();
            }
            documents.put(documentName, documentValue);
            return this;
        }

        public Pearson build() {
            return new Pearson(this);
        }

    }

    @Override
    public String toString() {
        return "Pearson{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", nameParents=" + nameParents +
                ", documents=" + documents +
                '}';
    }
}
