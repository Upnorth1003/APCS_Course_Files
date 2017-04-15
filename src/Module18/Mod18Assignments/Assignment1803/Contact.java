package Module18.Mod18Assignments.Assignment1803;

/**
 * @author Tyler
 * @version 4/15/2017
 * @purpose
 */
public class Contact
    {

        private String name, relation, bday, phone, email;

        public Contact(String name, String relation, String bday, String phone, String email)
            {
                this.name = name;
                this.relation = relation;
                this.bday = bday;
                this.phone = phone;
                this.email = email;
            }

        public String getName()
            {
                return name;
            }
        public String getRelation()
            {
                return relation;
            }
        public String getBday()
            {
                return bday;
            }
        public String getPhone()
            {
                return phone;
            }
        public String getEmail()
            {
                return email;
            }

        public String toString()
            {
                return String.format("%-16s", name)
                        + String.format("%-12s", relation)
                        + String.format("%-12s", bday)
                        + String.format("%-16s", phone)
                        + String.format("%16s", email);
            }
    }
