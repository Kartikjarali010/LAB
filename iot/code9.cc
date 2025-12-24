#include <LiquidCrystal_I2C.h>
#include <Wire.h>
//#include<String.h>
LiquidCrystal_I2C lcd(0x27,16,2);
void setup(){
  lcd.init();
  lcd.backlight();
}
void loop(){
  lcd.setCursor(0,0);
  lcd.print("bfhjo");
String mess="1234567890123456hellohi";
String mess1;

for(int i=0; i<mess.length();i++){
  mess1=(mess.substring(i)+mess.substring(0,i));
  lcd.setCursor(0,1);
  lcd.print(mess1);
  delay(300);
}
}