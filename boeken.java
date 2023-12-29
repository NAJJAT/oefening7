public abstract class boeken {
    
    private String titel ;
    private static int teler ;
    private final int code ;


   //  leeg constructor
    public boeken (String titel){
        this.titel = titel;
        boeken.teler++;
        this.code= teler;
    }

   public  abstract void geefDetails();

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public static int getTeler() {
        return teler;
    }

    public int getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((titel == null) ? 0 : titel.hashCode());
        result = prime * result + code;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        boeken other = (boeken) obj;
        if (titel == null) {
            if (other.titel != null)
                return false;
        } else if (!titel.equals(other.titel))
            return false;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "boeken [titel=" + titel + ", code=" + code + "]";
    }
    
      






}
