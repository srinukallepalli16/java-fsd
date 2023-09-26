package com.taxcalculation;
class Property{
	
	    private double Valueofland;
	    private boolean isInCity;
	    private int ageOfConstruction;
	    private double propertyarea;
	    private double tax;
	 
	    public Property(double Valueofland, boolean isInCity, int ageOfConstruction, double propertyarea) {
	        this.Valueofland = Valueofland;
	        this.isInCity = isInCity;
	        this.ageOfConstruction = ageOfConstruction;
	        this.propertyarea = propertyarea;
	    }
		public double getBaseValueofland() {
			return Valueofland;
		}
		public void setBaseValueofland(double Valueofland) {
			this.Valueofland = Valueofland;
		}
		public boolean isInCity() {
			return isInCity;
		}
		public void setInCity(boolean isInCity) {
			this.isInCity = isInCity;
		}
		public int getAgeOfConstruction() {
			return ageOfConstruction;
		}
		public void setAgeOfConstruction(int ageOfConstruction) {
			this.ageOfConstruction = ageOfConstruction;
		}
		public double getBuiltuparea() {
			return propertyarea;
		}
		public void setBuiltuparea(double builtuparea) {
			this.propertyarea = builtuparea;
		}
		public double calculatePropertyTax() {
	        double tax;
	        if (isInCity) {
	            tax = (propertyarea * ageOfConstruction * Valueofland) + (0.5 * Valueofland);
	        } else {
	            tax = propertyarea * ageOfConstruction * Valueofland;
	        }
	        System.out.println("======================================================================================================");
            System.out.printf("%5s  %10s  %10s  %8s %20s" , "BasevalueOfLand ", " IsInCityInput", "  AgeOfConstruction","  BuiltUpArea","PropertyTax");
            System.out.println();
            System.out.println();
            System.out.format("%7s %14s %15s %25s %27s",Valueofland,isInCity,ageOfConstruction,propertyarea,tax);
            System.out.println("\n=====================================================================================================");
	        return tax;
	        
	    }

	    @Override
	    public String toString() {
	    	 
	        return "Base Value: " + Valueofland + "\nIs in City: " + isInCity + "\nAge of Construction: " + ageOfConstruction
	                + "\nBuilt Up Area: " + propertyarea; 
	        
	    }
	    
	 
	
}

