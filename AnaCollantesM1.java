//Midterm 1 code for 59CST112Eve

//My first name is....Ana
//My middle name is....Luisa
//My last name is....Collantes

//first word....apple
//second word....lake
//third word....calm

////Globals for 3 colored balls////
float appleX, appleY, appleDX, appleDY;
float lakeX, lakeY, lakeDX, lakeDY;
float calmX, calmY, calmDX, calmDY;



String title= "CST112 MIDTERM 1 EXAM";
String news= "letter r to reset";
String author= "Ana Collantes";

////Table boundariesfloat left=90, right=480, top=80, bottom=230

float left=50, right=450, top=100, bottom=250;
float middle=250;
boolean wall=true, all=false, rat=false;;

////Green pool table
int tableRed=150, tableGreen=250, tableBlue=150;
int score=0,m=0,k=0;

////other declarations


void setup() {
 ///size of background
size(640, 480);

//Table boundaries
left=92;
right=545;
top=105;
bottom=370;
middle=290;
}

 void reset() {
   // Random positions.
   appleX=  random( middle,right );   appleY=  random( top, bottom );
   lakeX=  random( middle,right );   lakeY=  random( top, bottom );
   calmX=  random( middle,right );   calmY=  random( top, bottom );
   // Random speeds
   appleDX=  random( 2,3 );   appleDY=  random( 2,3 );
   lakeDX=  random( 3,4 );   lakeDY=  random( 3,4 );
   calmDX=  random( 2,5 );   calmDY=  random( 2,5 );
 }

void draw() {
  background(248,201,255);
  rectMode ( CORNERS );
  table( left, top, right, bottom);
  bounce();

  balls();
  show();
  messages();
}

  

void keypressed() {
  if (key == 'e') {exit(); }
  
}

////Table
void table( float east, float north, float west, float south) {
  ///pool table
  fill( tableRed, tableGreen, tableBlue);
  strokeWeight(20);
  ///brown walls
  stroke(127,0,0);
  rect( east-20, north-20, west+20, south+20);
  
  /////Wall in the middle of the pool table
  if (wall) {
    float middle= (east+west)/2;
    stroke(0,127,0);
    line( middle, north+10, middle, south-10);
  }
  stroke(0);
  strokeWeight(1);
}
  
  /////Bounce off the walls, and collisions
///void bounce
void bounce() {
  appleX += appleDX;  if ( appleX<left || appleX>right ) appleDX *= -1;
  appleY += appleDY;  if ( appleY<top || appleY>bottom ) appleDY *=  -1;

///yellow ball
  lakeX += lakeDX; if ( lakeX<left || lakeX>right ) lakeDX *= -1;
  lakeY += lakeDY; if ( lakeY<top || lakeY>bottom ) lakeDY *= -1;
  
//blue ball
calmX += calmDX; if ( calmX<left || calmX>right ) calmDX *= -1;
calmY += calmDY; if (calmY<top || calmY>bottom ) calmDY *= -1;
}
////collisions
//id collisions() {
  



void show() {
   
  fill( 44,255,250 );    ellipse( appleX,appleY, 30,30 );
  fill( 252,88,255 );  ellipse( lakeX,lakeY, 30,30 );
  fill( 255,191,88 );    ellipse( calmX,calmY, 30,30 );

  /// four black circles
//up--left
fill(0);
ellipse(90, 103, 30, 30);
 //up--right
fill(0);
ellipse(550, 103, 30, 30);
// down--left
fill(0);
ellipse(90,375, 30, 30);
//down--right
fill(0);
ellipse(550, 375, 30, 30);



}

///void buttons() {
  
  
  ///messages
 void messages() {
   fill (0);
   text(title, width/3, 15);
   text(news, width/9, 30);
   text(author, 10, height-5);
   
 }
 void balls(){
//apple--red
  fill(250,0,0);
  ellipse(150, 156, 30, 30);
 //lake--blue 
   fill(30,160,245);
  ellipse(200, 195, 30, 30);
  ///calm--green
  fill(31,80,40);
  ellipse(185, 250, 30, 30);
  
  
  
  
 }
