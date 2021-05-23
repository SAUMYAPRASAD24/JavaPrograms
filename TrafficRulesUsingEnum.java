enum TrafficSignalColours {
      RED("STOP"), GREEN("GO"), ORANGE("WAIT");
      private String action;
      TrafficSignalColours(String action){
        this.action = action;  
      }
      String getAction(){
		return this.action;
	}
}
class TrafficRulesUsingEnum{
      public static void main(String args[]) {
              TrafficSignalColours []signals = TrafficSignalColours.values();
              for (TrafficSignalColours signal : signals) {
                      System.out.println(signal + " means " + signal.getAction());
              }
       }
}