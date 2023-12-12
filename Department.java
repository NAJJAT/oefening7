public class Department extends Emploeey{

        private String DepartmentName ;
        private int DepartmenID;
    
        public Department() {
        }

        public Department(int DepartmenID, String DepartmentName) {
            this.DepartmentName = DepartmentName;
            this.DepartmenID = DepartmenID;
        }
        public String getDepartmentName() {
            return DepartmentName;
        }
        public void setDepartmentName(String DepartmentName) {
            this.DepartmentName = DepartmentName;
        }
        public int getDepartmenID() {
            return DepartmenID;
        }
        public void setDepartmenID(int DepartmenID) {
            this.DepartmenID = DepartmenID;
        }
        @Override
        public String toString() {
            return "Department [DepartmentName=" + DepartmentName + ", DepartmenID=" + DepartmenID + "]";
        }
        
    
}
