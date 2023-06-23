package com.atom.ongobuku;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class OngoWere extends AppCompatActivity {
    Toolbar toolbar;
    ListView listView;
    String [] items = {"","1.","2. All the way to Calvary","3. Wounded for me","4. ","5. The blood is sufficient","6. Blessed be the name","7. I will praise","8. Children of Jesus","9. The B-I-B-L-E","10. The best book",
    "11. Thy Word have I hid in my heart","12. Trust and obey","13. ","14. Jesus loves little children","15. For God so loved the world (1)","16. For God so loved the world (2)","17. Wide,wide as the ocean","18. One door,and only one","19. I am the door","20. Rolled way","21.","22. Oh,the love that sought me","23. Living he loved me","24. Ye must be born again","25. Believe on the Lord Jesus Christ","26. Into my heart","27. I do believe","28. Cleanse me","29. ","30.","31. ",
    "32. Jesus,Jesus,Jesus","33. Don't stop praying","34. What a friend","35. Hear the pennies dropping","36. Give,said the little stream","37. A little talk","38. Keep close to Jesus","39. He lives,he lives","40. Jesus,my lord,will love me for ever","41. I am feeding on the living bread","42.","43. We are building day by day","44. Be careful,little hands",
    "45. The wise man built","46. Whatsoever things","47. let the beauty of Jesus","48. O Christ,in thee","49. Jesus Christ is made to me","50. Only believe","51. Grace there is","52. Sin shall not have dominion","53. There's not a friend","54. Jesus first,Jesus last","55. The best friend","56. I have a Saviour who's mighty to keep","57. He will hold me fast",
    "58. Joy,joy,joy","59. Running over","60. I'm so happy","61. Down in my heart","62. Stayed upon Jehovah","63. Ring bells","64. Marching onward","65. Step by step","66. Follow,I will follow thee,my Lord","67. All power is given unto me","68. Steadily forward march","69. Shine,shine","70. Everybody should know","71. In my Father's house","72. I'm going home to die no more",
    "73. I'll be so glad when Jesus comes","74. I've a longing in my heart","75. The home of the soul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ongo_were);
        //list view things
        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,items);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Item position
                int itemPosition = position;
                //Item string value
                String itemValue = (String) listView.getItemAtPosition(position);
                String selected = itemValue;
                if (selected.equals("1.")) {
                    String title = "1";
                    String subtext = "O'du Yesuni osizuri eca 'bo! (2)\nOsi ngoa ya? Osi Betelehemua.\n  A'di olu osita Yesuni?\n  Malaika olu osita Yesuni.\n  Olu a'di tia? Olu Maria ma tia.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("title", title);
                    intent.putExtra("subtext", subtext);
                    startActivity(intent);
                }
                else if (selected.equals("2. All the way to Calvary")){
                    String title = "2. All the way to Calvary";
                    String subtext = "Yesu dra pati alaza ma ruaa;\nDra masi ra! Dra masi ra!\nYesu dra pati alaza ma ruaa;\nAda.dra masi ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("3. Wounded for me")){
                    String title = "3. Wounded for me";
                    String subtext = "Yi co eri ari be tu;\nYi di Yesu pati ruaa masi.\nYesu oji ma ra,tru ma indi,\nErini drale ndra masirisi.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("4. ")){
                    String title = "4. ";
                    String subtext = "Yi di Yesu pati alaza ruaa;\nYi di eri pati alaza ruaa.\nYi di eri,yi di eri;\nYi di eri ama e'yosi.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("5. The blood is sufficient")){
                    String title = "5. The blood is sufficient";
                    String subtext = "Ari 'di,fudri ci\n'Ba ma asi ojizu ala!\nAri 'di,Yesuni;\nAri Yesuni a'dule.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("6. Blessed be the name")){
                    String title = "6. Blessed be the name";
                    String subtext = "'Ba 'ba Papiri,'Ba 'ba Papiri,\n'Ba 'ba Papiri Yesu'i!\n'Ba 'ba Papiri,'Ba 'ba Papiri,\n'Ba 'ba Papiri Opi'i!\nAwa'difo Yesu mi vu;\nAndru ayiko ci!\nAwa'difo Yesu mini\nDrale ma onzisi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("7. I will praise")){
                    String title = "7. I will praise";
                    String subtext = "Ma ngani ku ku eri inzizu,\n'Ba ma Papiri,'Ba ma Papiri!\nMa ngani ku ku eri inzizu;\nEri 'ye onyiru tu ma vu.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("8. Children of Jesus")){
                    String title = "8. Children of Jesus";
                    String subtext = "1. Anzi Yesu Kristoni!\nEmini aciria,\nEmi inzi Yesu ru,\nAzi erinirisi.\n\n2. Yesu fe etu 'diri\n'Ba i lepi 'diyi dri,\nYi okuzu tualu,\nRu iniri inzizu!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("9. The B-I-B-L-E")){
                    String title = "9. The B-I-B-L-E";
                    String subtext = "'Diri Buku Munguni!\nBuku mani leleri,\nMunguni sile ama vuri;\n'Diri Buku Munguni!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("10. The best book")){
                    String title = "10. The best book";
                    String subtext = "1. Buku Munguni indi,\nEri aga buku dria.\nMi ma la eri zuzu;\nEri nga mi aza ko.\n\n2. Mi ma le Buku 'diri,\nVesi nizu mi tisi;\nEri osu miniri,\nA'di 'dizu onzi be.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("11. Thy Word have I hid in my heart")){
                    String title = "11. Thy Word have I hid in my heart";
                    String subtext = "Ma e'yo mini zi ma asia,\nMa kazu onzi 'yezu ku;\nMa kazu e'yo onzi 'yezu ku,\nMa e'yo mini zi ma asia!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("12. Trust and obey")){
                    String title = "12. Trust and obey";
                    String subtext = "Mi ma inzi E'yo Sizani dria;\nKa'dini ayiko nga ega mi asia!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("13. ")){
                    String title = "13. ";
                    String subtext = "Mi la Buku,mi zi Mungu,\nMi zi Mungu,mi zi Mungu!\nMi la Buku,mi zi Mungu,\nMi ka le zo ra!\n  Mi ka le zo ra (2)\n  Mi la Buku,mi zi Mungu,\n  Mi ka le zo ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("14. Jesus loves little children")){
                    String title = "14. Jesus loves little children";
                    String subtext = "Yesu le anzi avasi,\nAnzi wudrikuruni:\n'Ba iniru,emveru,\nLugbara avasi tu!\nLe anzi dria ma a'i eri'i!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("15. For God so loved the world (1)")){
                    String title = "15. For God so loved the world";
                    String subtext = "1. Munguni 'ba nyakua lele turisi,\nEri fe i ma mvi tile aluri'i,\nDrazu pati ma ruaa ama onzisi;\n'Di leta agapiri!\n\n2. 'Ba dria Opi Yesuni a'ipi 'diyi\nNgani dri ja 'de ku,nga idri isu ra!\n'Ba 'diyi anzi Munguni ada ada;\n'Di leta agapiri!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("16. For God so loved the world (2)")){
                    String title = "16. For God so loved the world (2)";
                    String subtext = "Mungu 'ba le 'dipi:\n  ('ba le 'dipi)\nEri fe i mvi tile aluri'i!\n'Ba dria Yesuni a'ipi 'diyi,\n'Ba Yesuni a'ipi ada\nMa ja dri ku (2)\nTe isu idri 'dani!\n  (idri 'daniri)\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("17. Wide,wide as the ocean")){
                    String title = "17. Wide,wide as the ocean";
                    String subtext = "Leta Yesuniri,eri amboru tu!\nWalaru,aliru,izuru tu!\nMa okpo kokoru,te ti,ma mva erini;\nBuku ece ma dri Yesu le ma 'dani\n  Avasi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("18. One door,and only one")){
                    String title = "18. One door,and only one";
                    String subtext = "Jotile alu:eri Yesu'i!\nAliale,amveleru idi.\nJotile alu:eri Yesu 'i!\nMa alialeru,te mi ngo-a ya?\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("19. I am the door")){
                    String title = "19. I am the door";
                    String subtext = "Ma jotile,ma jotile;\n'Ba ka fi ma vurisi,\nMa nga yi pa! (3)\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("20. Rolled way")){
                    String title = "20. Rolled away";
                    String subtext = "E'yo onzi mani wuzaru,\nLeta Yesuni ma vurisi!\nMa asi curu'do alaru,\nAri erini ralerisi!\nMa ovu idriru,osiza o'disi;\nE'yo onzi mani wuzaru,\nLeta Yesuni ma vurisi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("21.")){
                    String title = "21.";
                    String subtext = "1. Yesu le ma avasi, (3)\nEri'yo 'dini!\n\n2. Yesu dra ma paria, (3)\nMa a'i eri!\n\n3. Ari Yesuni ra ra, (3)\nAsi ojizu!\n\n4. Yesuni nga emvi ra, (3)\nMa nga eri ndre!\n\n5. Eri nga ma 'du 'bua, (3)\nOvuzu 'dani!\n\n6. Mi ma oja mi asi, (3)\nMi nga mi pa ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("22. Oh,the love that sought me")){
                    String title = "22. Oh,the love that sought me";
                    String subtext = "Yesu ndru ma pazu,\nJe ma,arinisi;\nEri ji ma Ata mani vu,\nJe ma 'yeta anzutirisi.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("23. Living he loved me")){
                    String title = "23. Living he loved me";
                    String subtext = "'Ba ma osi o'diru!\n'Ba ma osi o'diru!\nMa 'yo e'yo 'di 'ba dria ma tia:\n'Ba ma osi dika!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("24. Ye must be born again")){
                    String title = "24. Ye must be born again";
                    String subtext = "'Ba ma osi o'diru!\n'Ba ma osi o'diru!\nMa 'yo e'yo 'di 'ba dria ma tia:\n'Ba ma osi dika!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("25. Believe on the Lord Jesus Christ")){
                    String title = "25. Believe on the Lord Jesus Christ";
                    String subtext = "Mi a'i Opi Yesu Kristo! (3)\nMi nga mi pa ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("26. Into my heart")){
                    String title = "26. Into my heart";
                    String subtext = "Yesu,mi fi ma ma asia,\nMi fi ma asia,Yesu;\nMi fi andru,adadaru,\nTezu ma be 'dani 'dani!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("27. I do believe")){
                    String title = "27. I do believe";
                    String subtext = "Ma a'i e'yo 'diri ra:\nYesu dra ma paria;\nEri ari ra pati ruaa 'daa,\nAma truzu onzisi.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("28. Cleanse me")){
                    String title = "28. Cleanse me";
                    String subtext = "Mi 'ba ma alaru,\nMi fe okpo ma dri;\nMi oja ma mi vu,\nMi 'ba ma miniru.\nMi mba ma ta,Opi,\nE'yo mini nizu,\nMa ma ovu mini 'dani\nA'dule.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("29. ")){
                    String title = "29. ";
                    String subtext = "Yesu le mani ovuzu\nAsi alaru be,\nRu eriniri inzizu\nIdri mani alia.\n  Mi eri,mi eri;\n  Yesuni eri mi omve!\n  Mi eri,mi eri;\n  Ma mu Yesu vu andru!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("30.")){
                    String title = "30.";
                    String subtext = "Yesu emu ama pazu;\nEri dra pati ruaa.\nTe mi ka eri a'i ra\nMi nga idri isu.\n  Yesu,ma nga mu mi vu! (2)\n  Yesu,ma le mi avasi;\n  Ma a'i e'yo dria.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("31. ")){
                    String title = "31. ";
                    String subtext = "Yesu eca nyakua masi;\nKu Ata erini,fi drata alia.\nYesu le ma tu,avasi tu;\nMa pa ma ani erisi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("32. Jesus,Jesus,Jesus")){
                    String title = "32. Jesus,Jesus,Jesus";
                    String subtext = "Yesu,Yesu,Yesu,\nMa le mi a'i.\nMi fi ma asia;\nMa le mi avasi tu!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("33. Don't stop praying")){
                    String title = "33. Don't stop praying";
                    String subtext = "Mi zi Mungu! Mi ma ku ku;\nEri zita mini eri.\nMi zi 'dani,mi ande ku;\nMungu indi,eri fe ra.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("34. What a friend")){
                    String title = "34. What a friend";
                    String subtext = "Agyi amaniri Yesu,\nEri e'yo onzi wu;\nAma ovu drilebaru\n  Zizu eri tia zu.\nAma nga candi isu ra,\nAma ka zi tinia ku;\nAma asi anzu isu\n  Zizu eri tia zu.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("35. Hear the pennies dropping")){
                    String title = "35. Hear the pennies dropping";
                    String subtext = "Anzi,emi emu afa feza be;\nEmi eji sente fezu Yesu dri.\n  Yesu,Yesu,ma emu ra\n  Sente mani be.\n  Ma le afa fezu\n  Mi dri curu'do.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("36. Give,said the little stream")){
                    String title = "36. Give,said the little stream";
                    String subtext = "Mi ma mu sente be Yesu vu avasi;\nMi ma mu eri vu,mi yi mi sente 'doa.\nMungu le ama ambo,eri fe afa dria;\nAma ma mu eri vu awa'difo fe.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("37. A little talk")){
                    String title = "37. A little talk";
                    String subtext = "Amani ti ecizu Yesu be 'yeke!\nTi ecizu Yesu be 'ba afa 'yeke!\nCandi ka ca alu,candi ka ca kakau,\nTi ecizu Yesu be 'ba afa 'yeke.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("38. Keep close to Jesus")){
                    String title = "38. Keep close to Jesus";
                    String subtext = "Mi eci mi ti Yesu be 'dani\nMi te ogogo etu dria.\nInisi,etusi,mi fu amve ku;\nMi te ogogo Yesu be.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("39. He lives,he lives")){
                    String title = "39. He lives,he lives";
                    String subtext = "Yesu indi,idriru 'dani 'dani!\nEri ma be,aci ma be geri idriniria.\nYesu indi,'Ba ma Papiri'i!\nEri adri etuzu zu,ma asi ma alia.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("40. Jesus,my lord,will love me for ever")){
                    String title = "40. Jesus,my lord,will love me forever";
                    String subtext = "Ma Yesu Kristoniri,\nYesu mani indi;\nEwu were tokosi ku,\nCazu kpere 'dani!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("41. I am feeding on the living bread")){
                    String title = "41. I am feeding on the living bread";
                    String subtext = "Ma nya enya idriniri nya nya!\nMa mvu yi idriniri mvu mvu!\nTe 'ba ka mvu ra,Yesu 'yo,\nYi abiri ngani fu 'de ku.\n  Yi abiri dika ku ya?\n  Yo,abiri dika yo!\n  Yi abiri dika ku ya?\n  Yo,abiri dika yo!\n  Te 'ba ka mvu ra,Yesu yo,\n  Yi abiri ngani fu 'de ku!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("42.")){
                    String title = "42.";
                    String subtext = "Mungu ovu pari dria;\nMi apa erisi ngoa?\nNdre mi ra etuzu 'dani;\nMungu koni o'du ku.\n  Etu dria,ini be,\n  Mungu ovu 'ba ndrezu;\n  E'yo 'bani 'yele 'diyi\n  Eri si ra bukua!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("43. We are building day by day")){
                    String title = "43. We are building day by day";
                    String subtext = "Ama jo si o'du dria\nAdriza amani alia;\nSizu 'ba ma drisi ku,\nSizu vini onisi ku.\nJo amani sile 'diri\nEri idri amaniri;\nKristo ma imbatasi\nJo nde nga ovu 'bua 'dani.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("44. Be careful,little hands")){
                    String title = "44. Be careful,little hands";
                    String subtext = "1. Mi 'ye 'yeta onyiru,ma dri, (2)\nYesu Kristo 'buari,eri ne 'yeta mini;\nMi 'ye 'yeta onyiru,ma dri!\n\n2. Mi aci kililiru,ma pa, (2)\nYesu Kristo 'buari,eri ne pamvu mini;\nMi aci kilili,ma pa!\n\n3. Mi lu onzi vu,mileefi, (2)\nYesu Kristo 'buari,eri ne ndreta mini;\nMi lu onzi vu ku,mileefi!\n\n4. Ma co ma bile onyi eri, (2)\nYesu Kristo ni e'yo mani erileri'i;\nMa co ma bile onyi eri!\n\n5. Mi li inzo aluni ku,ti, (2)\nYesu Kristo eri e'yo mini 'yoleri;\nMi li inzo aluni ku,ti!\n\n6. Yesu,ma rua fe pi mi dri, (2)\nMa le ovuzu mini;mi ko ma aza 'dani!\nYesu,ma rua fe pi mi dri!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("45. The wise man built")){
                    String title = "45. The wise man built";
                    String subtext = "1. 'Ba onduaru si jo erini, (3)\nKata okporu dria.\nOzoo 'di va,vini yi ti ti, (3)\nTe jo nde so pa ci!\n\n2. 'Ba azazaru si jo erini, (3)\nPari cinyaruria.\nOzoo 'di va,vini yi ti ti, (3)\nJo nde asu i va!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("46. Whatsoever things")){
                    String title = "46. Whatsoever things";
                    String subtext = "E'yo dria ovupi\nAdaru 'diyi;\nE'yo ovupi dria\nInzizaru 'diyi;\nE'yo dria ovupi\nAlaru 'diyi:\nEmi dro asisile\nE'yo 'diyi dria.\n  Okpo Yesu Kristoni eri fudri ra;\n  Eri nga fe mi dri onzi agazu!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("47. let the beauty of Jesus")){
                    String title = "47. Let the beauty of Jesus";
                    String subtext = "Ma le asi ndriza Yesuni ece,\nAle ambo,alaru agapiri;\nOrindi Munguni,\nMi ga tre ma asia,\nAsisile Yesuni fezu ma dri.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("48. O Christ,in thee")){
                    String title = "48. O Christ,in thee";
                    String subtext = "E,Yesu Kristo eri fudri ra!\nMa leni ru andini ku.\nTe idri,leta,ayiko 'dani,\nMa nga isu mi vu,Opi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("49. Jesus Christ is made to me")){
                    String title = "49. Jesus Christ is made to me";
                    String subtext = "Yesu Kristo eco ra\nInisi,etusi;\nYesu Kristo eco ra\nEtu driasi.\nEri ovu adaru\nEtu dria 'ba vu 'do;\nEceni aluni ku\nAza kozasi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("50. Only believe")){
                    String title = "50. Only believe";
                    String subtext = "E'yo eco mi dri dria!\n'Ba okpo fepi mi dririsi;\nMi ma a'i,mi ka a'i,\nE'yo eco mi dri dria ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("51. Grace there is")){
                    String title = "51. Grace there is";
                    String subtext = "Okpo juru dria agazu,\nOkpo 'ba obepiri drozu,\nOkpo idri o'diru fezu:\nKristo alia\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("52. Sin shall not have dominion")){
                    String title = "52. Sin shall not have dominion";
                    String subtext = "E'yo onzi ngani mi aga ku!\nE'yo 'diri ovu baru adaru.\n'Yota Munguni ada;\nAma 'yo 'ba dria tia:\nE'yo onzi ngani mi aga ku.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("53. There's not a friend")){
                    String title = "53. There's not a friend";
                    String subtext = "'Ba ma aza kopiri Yesule\nAluni 'dini ku.\nEri nga asi azo ati ra;\nYesuni a'dule.\nYesu ni candi mani dria,\nYesuni ma dri ce 'dani;\nYesuni ma aza ko etuzu,\nYesu'i a'dule.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("54. Jesus first,Jesus last")){
                    String title = "54. Jesus first,Jesus last";
                    String subtext = "Ma isu Yesu ci,Yesu pari dri dria:\nAzita,avita mani alia.\nInisi,ka etusi,\nAngu ka tro ombaru ti,\nMa nga 'do'i ayikosi.\nTe Yesu avi ma dri 'de ku,\nYesu kuni ma ku.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("55. The best friend")){
                    String title = "55. The best friend";
                    String subtext = "'Ba ma lepiri Yesu'i (2)\nEri ma agei te,\nEri ko ma aza ra;\nE,'ba ma lepiri Yesu'i!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("56. I have a Saviour who's mighty to keep")){
                    String title = "56. I have a Saviour who's mighty to keep";
                    String subtext = "Yesu ma Papiri tali be tu!\nTali be tu! Tali be tu;\nNga di ma tani mba zu!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("57. He will hold me fast")){
                    String title = "57. He will hold me fast";
                    String subtext = "Eri ma ta mba, (2)\n'Ba ma Papiri le ma ra;\nEri ma ta mba!\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("58. Joy,joy,joy")){
                    String title = "58. Joy,joy,joy";
                    String subtext = "Ayiko,ayiko ovu indi!\nAyiko! Ma ni Yesu indi.\nEri ku onzi mani,\nMa nga tu uru 'bua;\nMa asini anzuru ayiko 'disi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("59. Running over")){
                    String title = "59. Running over";
                    String subtext = "Ayikosi,ayikosi,\nAyiko ga ma asia!\nErini ma parisi,\nOvule ma berisi,\nAyiko 'dani 'daniri!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("60. I'm so happy")){
                    String title = "60. I'm so happy";
                    String subtext = "Ayiko ga ma asia tre,\nMvi Munguni ma palerisi!\nEri dra pati alaza ruaa,\nLeta erini ma vurisi!\nNdra ma 'ba onzi 'yepiri,onzi tu;\nCuru'do ma mva Munguni adaru\nAyiko ga ma asia tre,\nMvi Munguni ma Palerisi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("61. Down in my heart")){
                    String title = "61. Down in my heart";
                    String subtext = "1. Ma ovu ayikosi asi mania,asi mania,asi mania;\nMa ovu ayikosi asi mania,asi mania 'dani.\n\n2. Leta Munguni indi asi mania,asi mania,asi mania;\nLeta Munguni indi asi mania,asi mania 'dani.\n\n3. Asi anzururi ci asi mania,asi mania,asi mania;\nAsi azururi ci asi mania,asi mania 'dani.\n\n4. Diza idriniri di asi mania,asi mania,asi mania;\nDiza idriniri di asi mania,asi mania 'dani.\n\n5. Yesu Kristo ma onyi asi mania,asi mania,asi mania;\nYesu Kristo ma onyi asi mania,asi mania 'dani.\n\n6. Orindi Alatararu asi mania,asi mania,asi mania;\nOrindi Alatararu asi mania,asi mania 'dani.\n\n7. Ma asi te Yesusi,asi mania,asi mania,asi mania;\nMa asi te Yesusi,asi mania,asi mania 'dani.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("62. Stayed upon Jehovah")){
                    String title = "62. Stayed upon Jehovah";
                    String subtext = "Ama le Yehova\nAsi driasi\nAyiko amboru\nIndi Yesusi!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("63. Ring bells")){
                    String title = "63. Ring bells";
                    String subtext = "Di di di,emi eri ari!\nDi di di,emi mu kanisaa,\nEmi fe awa'difo,\nEmi mu Mungu zizu;\nAndru ayiko indi,\nDi di di!\n  Didi didi di,(2)\n  Andru ayiko indi;\n  Di di di!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("64. Marching onward")){
                    String title = "64. Marching onward";
                    String subtext = "Ama mu aci drile zu,\nYesu vuti bizu ci.\nJuru ka eca,ama nga\nDria aga ra,Opisi.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("65. Step by step")){
                    String title = "65. Step by step";
                    String subtext = "Ma nga pa mani 'du\nAlu alu Yesu be;\nEtuzu,leti dria,\nAcizu letinia.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("66. Follow,I will follow thee,my Lord")){
                    String title = "66. Follow,I will follow thee,my Lord";
                    String subtext = "Ma nga mi ma vuti bi,Yesu,\nEtuzu 'dani 'dani.\nMi ni e'yo mani dria ra;\nMi nga ma dri ce 'bua.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("67. All power is given unto me")){
                    String title = "67. All power is given unto me";
                    String subtext = "Yi fe okpo ma dri fudri; (2)\nEmi mu e'yo Bari mani oluzu.\nMa adri emi be 'dani!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("68. Steadily forward march")){
                    String title = "68. Steadily forward march";
                    String subtext = "Emi ma mu 'ba dria jizu Yesu vu;\nYesuni nga 'ba onzi 'yepi 'diyi ati.\nEri nga 'ba pa ra:\n'Ba nyiri,'ba 'wara!\nMi mu yi ndru,mi ma olu:\nYesuni yi pa ra.\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("69. Shine,shine")){
                    String title = "69. Shine,shine";
                    String subtext = "Mi mu,mi tala 'i,\nMi fe dizani di,\nPari mini ovuzuria;\n'Bi'biole,mi ma di!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("70. Everybody should know")){
                    String title = "70. Everybody should know";
                    String subtext = "'Ba ma ni e'yo 'di, (2)\n'Ba wudrikuru ma ni ra:\nYesuni 'Ba Papiri!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("71. In my Father's house")){
                    String title = "71. In my Father's house";
                    String subtext = "1. Yesu gerini aku Mungunia,\n  Aku Mungunia,aku Mungunia!\nYesu gerini aku Mungunia;\n  Eri ayiko tu etuzu!\n\n2. Jo yi kakau aku Mungunia,\n  Aku Mungunia,aku Mungunia!\n  Eri ayiko tu etuzu!\n\n3. Eri nga emvi angu amania,\n  Angu amania,angu amania!\nEri nga emvi angu amania;\n  Eri ayiko tu etuzu!\n\n4. Ma nga tu uru aku Mungunia\n  Aku Mungunia,aku Mungunia!\nMa nga tu uru aku Mungunia;\n  Eri ayiko tu etuzu!\n\n5. Mi mu ma be 'daa,aku Mungunia,\n  Aku Mungunia,aku Mungunia!\nMi mu ma be 'daa,aku Mungunia;\n  Eri ayiko tu etuzu!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("72. I'm going home to die no more")){
                    String title = "72. I'm going home to die no more";
                    String subtext = "Aku Atani 'bua 'da\nOvu pari ayikoni;\nCandi ovuni 'dale ku,\nRua suza dria de ra.\n  Haleluya,Haleluya!\n  Ma tu 'dale 'bua uru!\n  (x2)\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("73. I'll be so glad when Jesus comes")){
                    String title = "73. I'll be so glad when Jesus comes";
                    String subtext = "1. Yesuni nga emvi dika\nAma jizu uru 'bua;\nCandi pi dra be\nYi nga dria de,\nYesu ka nga emvi dika!\n\n2. Mi le Yesu adaru ya?\nA'i e'yoniri ra ya?\nYesu dra pati\nAlaza ruaa,\nMi kazu drazu 'dani ku!\n\n3. 'Ba nde Yesu a'ipiri\nNga idri 'dani isu ra,\nNga tu Yesu be\nAku Mungunia,\nYesu ka nga emvi dika!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("74. I've a longing in my heart")){
                    String title = "74. I've a longing in my heart";
                    String subtext = "Ma le Yesu ma andreti nezu,\nOvuzu Yesu 'Ba ma Papiri be;\nMa ovu andezaru\nAsi mani alia,\nMani acizu va nyakua..\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("75. The home of the soul")){
                    String title = "75. The home of the soul";
                    String subtext = "1. Aku 'ba Kristoni ovu ndrizaru tu!\nAku aleni ndrizaru;\nJo Yesuni azi ngazuri dizaru,\nEri ovu 'ba Kristoni dri, (2)\nJo Yesuni azi ngazuri dizaru;\nEri ovu 'ba Kristoni dri!\n\n2. Aku 'ba Kristoni ovu ndrizaru tu!\nPari 'doa ovu onzi;\nE'yo dria 'doari ovu candiru,\nLonyi nyakua nga yi de ra! (2)\nE'yo dria 'doari ovu candiru;\nLonyi nyakua nga yi de ra.\n\n3. Aku 'ba Kristoni ovu ogogo tu!\nSawa nga de mbeleru tu;\nMa leni mani ovu 'doa ku ada,\nMa le Yesu ma mile ndre ra! (2)\nMa leni mani ovu 'doa ku ada;\nMa le Yesu ma mile ndre ra!\n\n";
                    Intent intent = new Intent(OngoWere.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
            }
        });


        //toolbar
        toolbar = findViewById(R.id.toolbarx);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Ongo Were");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To return to main activity
                OngoWere.super.onBackPressed();
            }
        });
    }
}
