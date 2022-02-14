import java.util.Objects;

public class Person
    {
        private int pId;
        private  String pName, pPhone,pAddress;
        private boolean isActive;

        public Person(int pId, String pName, String pPhone, String pAddress, boolean isActive) {
            this.pId = pId;
            this.pName = pName;
            this.pPhone = pPhone;
            this.pAddress = pAddress;
            this.isActive = isActive;
        }

        public Person() {
        }

        public int getpId() {
            return pId;
        }

        public void setpId(int pId) {
            this.pId = pId;
        }

        public String getpName() {
            return pName;
        }

        public void setpName(String pName) {
            this.pName = pName;
        }

        public String getpPhone() {
            return pPhone;
        }

        public void setpPhone(String pPhone) {
            this.pPhone = pPhone;
        }

        public String getpAddress() {
            return pAddress;
        }

        public void setpAddress(String pAddress) {
            this.pAddress = pAddress;
        }

        public boolean isActive() {
            return isActive;
        }

        public void setActive(boolean active) {
            isActive = active;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return pId == person.pId && isActive == person.isActive && Objects.equals(pName, person.pName) && Objects.equals(pPhone, person.pPhone) && Objects.equals(pAddress, person.pAddress);
        }

        @Override
        public int hashCode() {
            return Objects.hash(pId, pName, pPhone, pAddress, isActive);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "pId=" + pId +
                    ", pName='" + pName + '\'' +
                    ", pPhone='" + pPhone + '\'' +
                    ", pAddress='" + pAddress + '\'' +
                    ", isActive=" + isActive +
                    '}';
        }
    }
