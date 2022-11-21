package es.unileon.prg1.date;

public class Date {

    // Declaración variables

	private int day = 24;
	private int month = 11;
	private int year = 2022;
	
	public Date (int day, int month, int year) throws DateException {
		
		this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
	}
    public void setDay(int day) throws DateException {

    //Este método verifica el numero de días correcto de cada mes.

		if ( day < 1 || day > this.getDaysOfMonth() ) {
			throw new DateException("Date error: Day " + day + " of month " + this.month + " not valid");			
		}
		this.day = day;
	}
	private int getDaysOfMonth() {
        int numDays;
		
        numDays = 0;
        
		switch (this.month) {
		
        case 2:
		    numDays = 28;
		break;		
        
        case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
        break;
        
        case 1: 
        case 3: 
        case 5: 
        case 7: 
        case 8: 
        case 10: 
        case 12:
            numDays = 31;
        break;
			
        }
        return numDays;
    }
		
    public boolean IsSameDay(Date another){

    // Este método comprueba que sea el mismo día.

    boolean MismoDia = false;

    if(this.day == another.getDay()){
        MismoDia = true;
    System.out.println("Es el mismo dia");
    }else{
        MismoDia = false;
    System.out.println("No es el mismo dia");
     }
        return MismoDia;
    }
        
	public void setMonth (int month) throws DateException {

    /*Este método verifica que los meses que vayan del 1 al 12 y 
    en caso de por ejemplo introducir un mes mayor que 12 saltará en
    la consola un error indicando q ese mes no existe */

		if ( month < 1 || month > 12) {
			throw new DateException("Date error: Month " + month + " not valid");
		}
		this.month = month;
    }
    public boolean IsSameMonth(Date another){

    // Este método comprueba que sea el mismo mes.

    boolean MismoMes = false;

    if(this.month == another.getMonth()){
        MismoMes = true;
    System.out.println("Es el mismo mes");
    }else{
        MismoMes = false;
    System.out.println("No es el mismo mes");

     }
        return MismoDia;
    }
	
	public void setYear (int year) {

    // verifica el año.
    
		this.year = year;
    }
    
    public boolean IsSameYear(Date another){

    // Este método comprueba que sea el mismo mes.

    boolean MismoAño = false;

    if(this.year == another.getYear()){
        MismoAño = true;
    System.out.println("Es el mismo año");
    }else{
        MismoAño = false;
    System.out.println("Es el mismo año");

    }
        return MismoAño;
    }

    public boolean IsSame(Date another){

    // Este método comprueba que sea la misma fecha.

    boolean MismaFecha = false;
    
    if(this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear()) {
        MismaFecha  = true;
    System.out.println("Es la misma fecha");
    }else{
        MismaFecha  = false;
    System.out.println("Es la misma fecha");
    
    }
        return MismaFecha;
    }
    public string getNamesOfTheMonths() {
        
    // Con este método indicamos el nombre de cada mes.

        String nameMonths;

        nameMonths = "";

    switch (this.month) {
        
        case 1:
            nameMonths = "Enero";
         break;

        case 2:
            nameMonths = "Febrero";
         break;

        case 3:
            nameMonths = "Marzo";
         break;

        case 4:
            nameMonths = "Abril";
         break;

        case 5:
            nameMonths = "Mayo"; 
         break;

        case 6:
            nameMonths = "Junio";
         break;

        case 7:
            nameMonths = "Julio";
         break;

        case 8:
            nameMonths = "Agosto";
         break;

        case 9:
            nameMonths = "Septiembre";
         break;

        case 10:
            nameMonths = "Octubre";
         break;

        case 11:
            nameMonths = "Noviembre";
         break;

        case 12:
            nameMonths = "Diciembre";
         break;

		}
        return nameMonths;
    }
    
    //DUDA ¿Es necesario volver aponer lo de los meses? ¡Recuerda preguntar!

    public string getNamesSeasons() {
        
    // Con este método indicamos los meses que pertenecen a cada estación del año.

    String nameSeason;

    nameSeason = "";

    switch (this.month){

        case 9:
        case 10:
        case 11:
            nameSeason = "Otoño";
         break;

        case 12:
        case 1:
        case 2:
            nameSeason = "Invierno";
         break;
        
        case 3:
        case 4:
        case 5:
            nameSeason = "Primavera";
         break;

        case 6:
        case 7:
        case 8:
            nameSeason = "Verano";
         break;

        }
        return nameSeason;

    }
     }
    
    public String getMonthsLefthUntil(){

    // Con este método indicamos los meses que quedan hasta el final del año.

    String Builder MonthsLefthUntil = new StringBuilder();

    for (int i=12, <=this.month, i-- ) {
        MonthsLefthUntil.appened(i);
    }
    return MonthsLefthUntil.toString();
    }

    public String DateStringVersion(){
    
    /* En caso de que el formato sea por ejemplo 24/11/2022
    este método mostrará cualquier fecha con este mismo formato*/

    return (this.day+"/"+this.month+"/"+this.year);
    }

    public String getDatesUntilTheEndMonth() {
        
    // Con este método devolvemos las fechas que quedan hasta el final del mes
    
    String Builder DatesUntilTheEndMonth = new StringBuilder();
    
    switch (this.month){
    case 2:

        for (int i=1; i<28; i++ ) {
            DatesUntilTheEndMonth.appened(i+"/"+this.month+"/"+this.year);
     }
     break;		
    
    case 4:
    case 6:
    case 9:
    case 11:

        for (int i=1; i<30; i++ ) {
            DatesUntilTheEndMonth.appened(i+"/"+this.month+"/"+this.year);
     }
     break;
    
    case 1: 
    case 3: 
    case 5: 
    case 7: 
    case 8: 
    case 10: 
    case 12:
        for (int i=1; i<31; i++ ) {
            DatesUntilTheEndMonth.appened(i+"/"+this.month+"/"+this.year);
     }
     break;
    }
        return DatesUntilTheEndMonth.toString();
    }   
    public String getMonthsSameNumberOfDays() {
        
    /* Con este método mostramos el resto de meses 
    con los mimos días que el mes de la fecha.]*/
        
    String Builders Months = new StringBuilder();
        
    switch (this.month){
        
        case 1:
            Months = "Marzo, Mayo, Julio, Agosto, October, December";
         break;

        case 2:
            Months = "Febrero";
         break;

        case 3:
            Months = "Enero, Mayo, Julio, Agosto, October, December";
         break;

        case 4:
            Months = "Junio, Septiembre, Noviembre";
         break;

        case 5:
            Months = "Enero, Marzo, Julio, Agosto, October, December";
         break;

        case 6:
            Months = "Abril, Septiembre, Noviembre";
         break;

        case 7:
            Months = "Enero, Marzo, Mayo, Agosto, October, December";
         break;

        case 8:
            Months = "Enero, Marzo, Mayo, Julio, October, December";
         break;

        case 9:
            Months = "Abril, Junio, Noviembre";
         break;

        case 10:
            Months = "Enero, Marzo, Mayo, Julio, Agosto, December";
         break;

        case 11:
            Months = "Abril, Junio, Septiembre";
         break;

        case 12:
            Months = "Enero, Marzo, Mayo, Julio, Agosto, October";
         break;

		}
        return Months.toString();


    }

    public String getDaysSinceFirstDayYear(){

    /*Con este método mostraremos los días que han pasado desde 
    la fecha hasta el primer dia del año*/
    
    StringBuilder DaysSinceFirstDayYear = new StringBuilder();

    for(int i=1; i<365; i++){
        DaysSinceFirstDayYear.appened(i);
    }
    return DaysSinceFirstDayYear;




    }
        

        
    


    

}
	