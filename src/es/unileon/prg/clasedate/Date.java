package es.unileon.prg1.date;

public class Date {

    // Declaración variables

	private int day = 1;
	private int month = 1;
	private int year = 2017;
	
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

    boolean SameDay = false;

    if(this.day == another.getDay()){
        SameDay = true;
    System.out.println("Es el mismo dia");
    }else{
        SameDay = false;
    System.out.println("No es el mismo dia");
     }
        return SameDay;
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

    boolean SameMonth = false;

    if(this.month == another.getMonth()){
        SameMonth = true;
    System.out.println("Es el mismo mes");
    }else{
        SameMonth = false;
    System.out.println("No es el mismo mes");

     }
        return SameMonth;
    }
	
	public void setYear (int year) {

    // verifica el año.
    
		this.year = year;
    }
    
    public boolean IsSameYear(Date another){

    // Este método comprueba que sea el mismo mes.

    boolean SameYear = false;

    if(this.year == another.getYear()){
        SameYear= true;
    System.out.println("Es el mismo año");
    }else{
        SameYear = false;
    System.out.println("Es el mismo año");

    }
        return SameYear;
    }

    public boolean IsSame(Date another){

    // Este método comprueba que sea la misma fecha.

    boolean SameDate = false;
    
    if(this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear()) {
        SameDate = true;
    System.out.println("Es la misma fecha");
    }else{
        SameDate  = false;
    System.out.println("Es la misma fecha");
    
    }
        return SameDate;
    }
    public string getMonthName() {
        
    // Con este método indicamos el nombre de cada mes.

        String nameMonths;

        nameMonths = "";

    switch (this.month) {
        
        case 1:
            nameMonths = "January";
         break;

        case 2:
            nameMonths = "February";
         break;

        case 3:
            nameMonths = "March";
         break;

        case 4:
            nameMonths = "April";
         break;

        case 5:
            nameMonths = "May"; 
         break;

        case 6:
            nameMonths = "June";
         break;

        case 7:
            nameMonths = "July";
         break;

        case 8:
            nameMonths = "August";
         break;

        case 9:
            nameMonths = "September";
         break;

        case 10:
            nameMonths = "October";
         break;

        case 11:
            nameMonths = "November";
         break;

        case 12:
            nameMonths = "December";
         break;

		}
        return nameMonths;
    }
    
    public string getSeasonName() {
        
    // Con este método indicamos los meses que pertenecen a cada estación del año.

    String Season;

    Season = "";

    switch (this.month){

        case 9:
        case 10:
        case 11:
            Season = "Autumn";
         break;

        case 12:
        case 1:
        case 2:
            Season = "Winter";
         break;
        
        case 3:
        case 4:
        case 5:
            Season = "Spring";
         break;

        case 6:
        case 7:
        case 8:
            Season = "Summer";
         break;

        }
        return Season;

    }
     }
    
    public String getMonthsLeft(){

    // Con este método indicamos los meses que quedan hasta el final del año.

    StringBuilder MonthsLefthUntil = new StringBuilder();

    for (int i=12, <=this.month, i-- ) {
        MonthsLefthUntil.appened(i);
    }
    return MonthsLefthUntil.toString();
    }

    public String testToString(){
    
    /* En caso de que el formato sea por ejemplo 1/17/2017
    este método mostrará cualquier fecha con este mismo formato*/

    return (this.day+"/"+this.month+"/"+this.year);
    }

    public String getDaysLeftOfMonth() {
        
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
    public String getMonthsSameDays() {
        
    /* Con este método mostramos el resto de meses 
    con los mimos días que el mes de la fecha.]*/
        
    StringBuilders Months = new StringBuilder();
        
    switch (this.month){
        
        case 2:
            Months = "February";
         break;

        case 4:
        case 6:
		case 9:
		case 11:
            Months = "April, June, September, November";
         break;

        case 1:
        case 3: 
        case 5: 
        case 7: 
        case 8: 
        case 10: 
        case 12:
            Months = "January, March, May, July, August, October, December";
         break;

        

		}
        return Months.toString();


    }

    public int getDaysPast(){

    /*Con este método mostraremos los días que han pasado desde 
    la fecha hasta el primer dia del año*/
    
    int daysSince = this.day;

    for(int i= this.month-1, i>=1; i--){
        daysSince.appened(i);
    }
    return daysSince;

    public int testNumRandomTriesEqualDate()

    /* Este método indica el número de intentos hasta que acierte el día escrito,
    mi método tiene un error y es que no he logrado que identifique los meses
    por lo que si por ejemplo introdujeramos el día 24/11/22 en la cónsola, en 
    caso de acertar, aparecería el número 327 que son los días que han pasado
    desde el 1/1/22*/
    

    int i=365,randomDay;
    int numAttempts = 0;

    do{
        System.out.println("Introduce el día:");
		randomDay = Teclado.readInteger(i);
    i--;
    }
    while(i=randomDay){
     if(int i == randomDay){
        numAttempts = 1
    }else if(int i <= randomDay){
        numAttempts = numAttempts + 1
    }else (int i >= randomDay){
        numAttempts = numAttempts + 1
    }
        return numAttempts;
        }
    }


    public String DaysOfTheWeek(int i=365,randomDay;) throws DateException {
    
     // Con este método dividimos los 365 diás del año en semanas con un módulo 7.

    StringBuilder diasemana = new StringBuilder();

    int DaysOfTheWeek = (this.DaysPast(mod 7));

    switch (DaysOfTheWeek) {
        case 1:
            diaSemana.append("Monday");
         break;

         case 2:
            diaSemana.append("Tuesday");
         break;

         case 3:
            diaSemana.append("Wednesday");
         break;

         case 4:
            diaSemana.append("Thursday");
         break;

         case 5:
            diaSemana.append("Friday");
         break;

         case 6:
            diaSemana.append("Saturday");
         break;

         case 7:
            diaSemana.append("Sunday");
         break;
        
        }

        return diaSemana.toString();
    }



    }




    }
        

        
    


    

}
	