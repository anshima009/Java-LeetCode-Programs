public class converTheTemperature {
    
        public double[] convertTemperature(double celsius) {
            double[] temp=new double[2];
            double kelvin=celsius+273.15;
            double fahrenheit=celsius*1.80+32.00;
            temp[0]=kelvin;
            temp[1]=fahrenheit;
            return temp;
        }
    
}
