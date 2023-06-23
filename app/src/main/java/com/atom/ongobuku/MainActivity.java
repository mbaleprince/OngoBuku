package com.atom.ongobuku;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    //Word things
    ListView listView;
    ListView ongo;
    //Ongo buku headings
    String [] items = {"","Ongo(1) (Based on Te Deum)", "Ongo(2) Holy,holy,holy", "Ongo(3) O worship the King", "Ongo(4) Praise to the Lord,the Almighty", "Ongo(5) Come ye faithful, raise the anthem", "Ongo(6) The God of Abraham praise","Ongo(7) To God be the glory", "Ongo(8) Tune:It's me, O lord","Ongo(9) We come,Lord,to thy feet","Ongo(10) Jesus,stand among us","Ongo(11)","Ongo(12) Praise God,from whom all blessings flow","Ongo(13) Give Glory to the Father","Ongo(14)","Ongo(15)","Ongo(16) Count your blessings","Ongo(17) Once in royal David's city","Ongo(18) Away in a manger","Ongo(19) O little town of Bethlehem","Ongo(20) Silent night","Ongo(21) While shepherds watched","Ongo(22)","Ongo(23) See amid the winter snow","Ongo(24) Hark,the herald angels sing","Ongo(25) Angels from the realms of glory",
    "Ongo(26) O leave your sheep","Ongo(27) As with gladness men of old","Ongo(28) Thou didst leave thy throne","Ongo(29) O come,all ye faithful","Ongo(30) Tune:He rose from the dead","Ongo(31) Hark,the glad sound!","Ongo(32)","Ongo(33) Jesus paid it all","Ongo(34) Tell me the old,old story","Ongo(35) Jesus loves me","Ongo(36) Iam so glad","Ongo(37) One there is above all others","Ongo(38) The great physician","Ongo(39) Tune:The Old-Time Religion","Ongo(40) All glory,laud,and honour","Ongo(41) There is a green hill","Ongo(42) Weeping will not save me","Ongo(43) Near the cross","Ongo(44) Precious,precious blood","Ongo(45) When I survey the wondrous cross","Ongo(46) When wounded sore the stricken heart","Ongo(47) It is a most wonderful","Ongo(48) I gave my life for thee","Ongo(49) Tune:When Israel was in Egypt's land","Ongo(50) Jesus lives",
    "Ongo(51) The strife is o'er","Ongo(52) Haleluya,Hallelujah","Ongo(53) Jesus Christ is risen to-day","Ongo(54) Low in the grave he lay","Ongo(55) This joyful Eastertide","Ongo(56)","Ongo(57) Crown him with many crowns","Ongo(58) He rose from the dead","Ongo(59)","Ongo(60)","Ongo(61) When the roll is called","Ongo(62)","Ongo(63) When he cometh","Ongo(64) On the resurrection morning","Ongo(65)","Ongo(66) When morning comes","Ongo(67) Till he come","Ongo(68) Thy kingdom come,O God","Ongo(69) Come,let us join our cheerful songs","Ongo(70) All hail the power of Jesus' name","Ongo(71)","Ongo(72) O brothers,lift your voices","Ongo(73) Come,sing with holy gladness","Ongo(74) Come,ye that love the Lord","Ongo(75)","Ongo(76) I will sing the wondrous story","Ongo(77) Blessed be the name","Ongo(78) Man of sorrows","Ongo(79) Glory to his name","Ongo(80) Tune:Prayer is the key of heaven","Ongo(81) Tune:Mary and Martha","Ongo(82) Lord of glory","Ongo(83) What a wonderful Saviour","Ongo(84) Zaburi 40.1-3","Ongo(85) Blessed assurance","Ongo(86) Hallelujah,sing to Jesus","Ongo(87) Praise the Saviour,ye who know him","Ongo(88) Precious Saviour,I will praise thee","Ongo(89) Glory to Jesus","Ongo(90) How sweet the name of Jesus sounds","Ongo(91) At the name of Jesus","Ongo(92) It passeth knowledge","Ongo(93) All hail the power of Jesus' name","Ongo(94) Our blessed Redeemer","Ongo(95) Come,Holy Ghost,our souls inspire","Ongo(96) Come,gracious Spirit","Ongo(97) Spirit Divine","Ongo(98) O Holy Spirit,whom our Master sent","Ongo(99) O Spirit of the living God","Ongo(100) Fill me now",
    "Ongo(101) Breathe on me,Breath of God","Ongo(102) Breathe on me,Breath on God","Ongo(103)","Ongo(104) Standing on the promises","Ongo(105) Cling to the Bible","Ongo(106) Break thou the Bread of life","Ongo(107) Holy Bible,book divine","Ongo(108)","Ongo(109) Lord,thy Word abideth","Ongo(110) More about Jesus","Ongo(111) 'Tis so sweet","Ongo(112) Tune:Swing low sweet chariot","Ongo(113) The love of God is greater far","Ongo(114)","Ongo(115) Nothing but the blood of Jesus","Ongo(116) Have yo been to Jesus?","Ongo(117)","Ongo(118) Whosoever will","Ongo(119)","Ongo(120) There is life for a look","Ongo(121)","Ongo(122) Only a step to Jesus","Ongo(123) Come,ye sinners","Ongo(124) Lugbara tune:Kani","Ongo(125) Precious name","Ongo(126) Jesus calls us","Ongo(127)","Ongo(128) Tune:O brothers,don't stay away","Ongo(129) Jesus,I will trust thee","Ongo(130) Iam trusting thee,Lord Jesus","Ongo(131) Just as Iam","Ongo(132)","Ongo(133) I hear thy welcome voice","Ongo(134) Jesus,my Lord","Ongo(135) There is a city bright","Ongo(136) Pass me not","Ongo(137) Rock of Ages","Ongo(138) Jesus,Lover of my soul","Ongo(139)","Ongo(140) Iam coming to the cross","Ongo(141) I'm troubled in mind","Ongo(142) The Church's one foundation","Ongo(143) For all the saints","Ongo(144) The Son of God goes forth to war","Ongo(145) Through the night of doubt and sorrow","Ongo(146) Whither,pilgrims,are yo going?","Ongo(147)","Ongo(148) We love the place,O God","Ongo(149) What a friend we have in Jesus","Ongo(150) I must tell Jesus",
    "Ongo(151) Come,my soul,thy suit prepare","Ongo(152) Tune:Prayer is the key to heaven","ongo(153) Tune:And I couldn't hear nobody pray","Ongo(154) Come ye yourselve apart","Ongo(155) Resting in the everlasting arms","Ongo(156) Safely through another week","Ongo(157) This is the day of light","Ongo(158)","Ongo(159) Tune:Lord,I want to be a Christian","Ongo(160)","Ongo(161) I hunger and I thirst","Ongo(162)","Ongo(163) Let us break bread together","Ongo(164) Speak,Lord,in the stillness","Ongo(165) Lord,speak to me","Ongo(166) Hushed was the evening hymn","Ongo(167) The joyful news","Ongo(168) We have heard the joyful sound","Ongo(169) Wonderful words of life","Ongo(170) For my sake and the gospel's go","Ongo(171) Tune:John Brown's body","Ongo(172) To the regions beyond","Ongo(173) Rescue the perishing","Ongo(174) Let the song go round the earth","Ongo(175) Thou whose almighty word","Ongo(176)","Ongo(177) I love to tell the story","Ongo(178) Tune:We need more reapers","Ongo(179) Fight the good fight","Ongo(180) Onward,Christian soldiers","Ongo(181) Stand up,stand up for Jesus","Ongo(182) Sound the battle cry","Ongo(183) There's a fight to be fought","Ongo(184) Victory through grace","Ongo(185) The Lord's my Shepherd","Ongo(186) The King of love my Shepherd is","Ongo(187) Iam Jesus' little lamb","Ongo(188) O GOd,our help","Ongo(189)","Ongo(190) A safe stronghold","Ongo(191) Tune:When Israel was in Egypt's land","Ongo(192) Like a river glorious","Ongo(193) Abide with me","Ongo(194) O happy day","Ongo(195)","Ongo(196) When we walk with the Lord","Ongo(197) O walk with Jesus","Ongo(198) I heard the voice of Jesus say","Ongo(199) Where he leads me",
    "Ongo(200) O Jesus,I have promised","Ongo(201) Art thou weary?","Ongo(202)","Ongo(203) Take my life","Ongo(204) Lead me to calvary","Ongo(205)","Ongo(206) Who is on the Lord's side","Ongo(207) He leadth me","Ongo(208) Jesus,still lead on","Ongo(209) Near to thee","Ongo(210) Guide me,O thou great Jehovah","Ongo(211) Lead us,Heavenly Father,lead us","Ongo(212) My faith looks up to thee","Ongo(213) Nearer,my God,to thee","Ongo(214) Thy way,not mine,O Lord","Ongo(215) Tune: O Freedom","Ongo(216) O for a heart to praise my God","Ongo(217) Come,thou Fount","Ongo(218)","Ongo(219) Gentle Jesus","Ongo(220) Jesus bids us shine","Ongo(221) I lay my sins on Jesus","Ongo(222) Lord,I want to be a Christian","Ongo(223) Yield not to temptation","Ongo(224) Look to the Lambo of God","Ongo(225) Tune:It's me,O lord","Ongo(226) I need thee every hour","Ongo(227) Tune:O by and by","Ongo(228)","Ongo(229) The night is far advanced","Ongo(230) I'm a little pilgrim","Ongo(231) Higher ground","Ongo(232) There is a better world","Ongo(233) There is a happy land","Ongo(234) There is no night in heaven","Ongo(235) A few more years shall roll","Ongo(236) Tune:I want to be ready","Ongo(237)","Ongo(238) Tune:Swing low,sweet chariot","Ongo(239)","Ongo(240) Tune:John Browns body","Ongo(241) Tune:Swing low,sweet chariot","Ongo(242)","Ongo(243) Tune:A wheel in a wheel","Ongo(244)","Ongo(245) Hush,blessed are the dead","Ongo(246)","Ongo(247)","Ongo(248) Shall we gather at the river ?","Ongo(249) Come,ye thankful people,come","Ongo(250) We plough the fields","Ongo(251) All things bright and beautiful","Ongo(252)","Ongo(253)","Ongo(254)","Ongo(255) Forth in thy name",
    "Ongo(256) Awake,my soul","Ongo(257) At thy feet,O Christ,we lay","Ongo(258)","Ongo(259) O Jesus,Lord of heavenly grace","Ongo(260) Jesus,from thy throne","Ongo(161) The day thou gavest","Ongo(262) Now the day is over","Ongo(263) Day is dying in the west","Ongo(264)","Ongo(265) At even,ere the sun was set","Ongo(266) Psalms 95.1-7","Ongo(267) Luke 1.68-79","Ongo(268) Psalms 100","Ongo(269) Luke 1.46-55",
    "Ongo(270) Psalms 98.1-4","Ongo(271) Luke 2.29-32","Ongo(272) Psalms 67"};
//ongo were
    String [] ongoweres = {"","1.","2. All the way to Calvary","3. Wounded for me","4. ","5. The blood is sufficient","6. Blessed be the name","7. I will praise","8. Children of Jesus","9. The B-I-B-L-E","10. The best book",
            "11. Thy Word have I hid in my heart","12. Trust and obey","13. ","14. Jesus loves little children","15. For God so loved the world (1)","16. For God so loved the world (2)","17. Wide,wide as the ocean","18. One door,and only one","19. I am the door","20. Rolled way","21.","22. Oh,the love that sought me","23. Living he loved me","24. Ye must be born again","25. Believe on the Lord Jesus Christ","26. Into my heart","27. I do believe","28. Cleanse me","29. ","30.","31. ",
            "32. Jesus,Jesus,Jesus","33. Don't stop praying","34. What a friend","35. Hear the pennies dropping","36. Give,said the little stream","37. A little talk","38. Keep close to Jesus","39. He lives,he lives","40. Jesus,my lord,will love me for ever","41. I am feeding on the living bread","42.","43. We are building day by day","44. Be careful,little hands",
            "45. The wise man built","46. Whatsoever things","47. let the beauty of Jesus","48. O Christ,in thee","49. Jesus Christ is made to me","50. Only believe","51. Grace there is","52. Sin shall not have dominion","53. There's not a friend","54. Jesus first,Jesus last","55. The best friend","56. I have a Saviour who's mighty to keep","57. He will hold me fast",
            "58. Joy,joy,joy","59. Running over","60. I'm so happy","61. Down in my heart","62. Stayed upon Jehovah","63. Ring bells","64. Marching onward","65. Step by step","66. Follow,I will follow thee,my Lord","67. All power is given unto me","68. Steadily forward march","69. Shine,shine","70. Everybody should know","71. In my Father's house","72. I'm going home to die no more",
            "73. I'll be so glad when Jesus comes","74. I've a longing in my heart","75. The home of the soul"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                if (selected.equals("Ongo(1) (Based on Te Deum)")) {
                    String title = "Ongo(1) (Based on Te Deum";
                    String subtext = "1 .Mungu, ama mi ru inzi,\nAma mi a'i Opiru:\n  Haleluya,Haleluya.\nAta amani 'daniri,\nNyaku driani mi inzi:\nHaleluya. (5)\n\n2. 'Ba mi inzipi tu 'diyi,\n'Diyi malaika mini:\nHaleluya,Haleluya.\nSerafi,Kerubi pie,\nYi dria mi ru inzi tu:\nHaleluya. (5)\n\n3. Mungu alatararuri,\nAsi ndriza awapiri:\nHaleluya,Haleluya.\nMungu,mi 'ba afa dria,\nAmbo miniri ma ku ra:\nHaleluya. (5)\n\n4. 'Ba ti opele 'diyi dria\nYi ru mini inzi 'dani:\n Haleluya,Haleluya.\n'Ba nabiru drio 'diyi\nYi ru mini inzu 'bua:\nHaleluya. (5)\n\n5. 'Ba drapi Yesu rusi 'diyi\nYi 'yeta Yesuniri ngo: Haleluya,Haleluya.\n'Ba Kristoni 'diyi dria,\nYi mi ru inzi nyakua:\n  Haleluya. (5)\n\n6. Ata amani amboru,\nMva mini inzita beri:\n Haleluya,Haleluya.\nOrindi Alatararu,\nAma Mungu alu inzi:\n Haleluya. (5)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("title", title);
                    intent.putExtra("subtext", subtext);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(2) Holy,holy,holy")){
                    String title = "Ongo(2) Holy,holy,holy";
                    String subtext = "1. Mungu okpo be tu, Alatararuri,\nO'biti be drio ama mi ru inzi;\nMungu yiki be tu,Alatararuri,\nAta,Orindi,Mvi:Mungu alu.\n\n2.'Ba yi mi ru inzi,Alatararuri,\n'Ba Kristo dria avu va mi palaa\nMalaika yi mi inzi 'bua indi,\nMungu okori,Mungu 'daniri.\n\n3. Mungu alaruri,iriti alia,\n'Ba onzi econi diza mini ndre ku.\nOpi mi a'dule,mi alatararu,\nOkpo e'ini asi ndriza be.\n\n4. Mungu okpo be tu,Alatararuri,\nAfa mini dria yi ru mini inzi.\nMungu yiki be tu,Alatararuri,\nAta,Orindi,Mvi:Mungu alu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(3) O worship the King")){
                    String title = "Ongo(3) O worship the King";
                    String subtext = "1. Ama mi inzi,Mungu amani\nAma ongo ngo ale minisi;\nMi adri'ba ta mba ,yi aza kozu,\nInzita ace mi diza be kuru.\n\n2. Nyaku ma eti,Opi amani,\nMi 'ba ndra drio okpo minisi;\nNyaku so pa e'yo minirisi ra,\nMi 'ba miri dria lokirini be.\n\n3. Anyapa dria yi mi ru inzi,\nOzoo etu be,oli pie dria;\n'Bu pi,ovi pie,oliriko be,\nYi dria ati'ba anzi 'yepi 'diyi.\n\n4. Okpo miniri asi anzu be\nAma ma olu angu vusi dria;\nTe geri mini afa ta mbazuri\nA'di eco e'yoni 'yozuni ya?\n\n5. Ama anzini,ama okpo yo,\nAma asi 'ba mi dria ani;\nAsi ndriza miniri osuzaru,\nAma nga di ca onzo mi vu 'bua.\n\n6. Okpo e'i la, ale be turi,\nMalaika dria yi mi inzu;\n'Ba ongulumuru mini trule 'diyi,\nYi mi inzu 'dani asikokoru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(4) Praise to the Lord,the Almighty")){
                    String title = "Ongo(4) Praise to the Lord,the Almighty";
                    String subtext = "1. Mi inzi Mungu,eri afa dria ma Opi.\nMi inzi,te eri pata fe mi dri etuzu.\n  Emi emu,\nAdripi amvipi be,\nEmi inzi ayikosi.\n\n2. Mi inzi Mungu,eri opi nya osutaru.\nEri mi ji i ma wua e'yere etuzu.\n  Mi ndre ra ya?\n  Afa mini leleri\nEri fe mi dri avasi.\n\n3. Mi inzi Mungu,eri mi agei te zu zu,\nAda eri ma onyi ovu mi be yikisi.\n  Mi ma ega\n  Okpo ambo Munguni;\nEri mi aza ko 'dani.\n\n4. Mi inzi Mungu,mi ma inzi asi driasi;\nEmi 'ba idri be 'diyi emu eri inzi.\n  'Ba ma oyu\n  Amena eri vu zu;\nAma inzi ayikosi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(5) Come ye faithful, raise the anthem")){
                    String title = "Ongo(5) Come ye faithful, raise the anthem";
                    String subtext = "1. Emi emu Mungu inzi,\n 'Ba Yesuni pale 'diyi.\nEmi e'da inzitani;\n Eri 'Ba 'ba 'Bapiri,\nEri ovu okokele\n De afa azini yo.\n\n2. De nga miri ovuni ku,\n De nyaku aluni yo,\nYesu Kristo Mva\n Munguni\nEri ngonde drazura;\nEri asi ve amasi\n Ale amborurisi.\n\n3. Curu'do 'bua uru re\n Ede pari amani ovuzu\n Milenia zuzuri;\n'Doa ama candi isu,\n 'Daa ayiko a'dule.\n\n4. 'Ba dria ma inzi Mungu\n 'Bua,nyakua indi;\nMalaika 'ba be dria,\n Yi ma inzi eri ru.\nMungu Opi diza beri,\n Ama mi inzi ada.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(6) The God of Abraham praise")){
                    String title = "Ongo(6) The God of Abraham praise";
                    String subtext = "1. Ama inzi Mungu\nIbrahimuniri;\nEri ri Opiru 'bua\n'Dani 'dani.\nMa eri ru inzi,\nEri Yehova'i;\nEri asi ndriza e'i,\nAle be tre.\n\n2.Ama inzi Mungu\nIbrahimuniri;\nEri ama omve i vu\nUru 'bua.\nE'yo nyakuni 'diyi,\nMa ku yi dria ra,\nMungu 'bazu awuruso\nManiriru.\n\n3. Ma nga ca 'bua ra\nYiki erinisi;\nEri nga ma 'du ovuzu\nIbe 'dale\nMa nga eri ndre 'daa,\nMa nga eri inzi,\nMa nga ongo ngo eri dri\nAyikosi.\n\n4. 'Ba ama Papiri,\nMungu ma Mvaruri,\nOpi asi anzuniri\nTu 'bua 'bo.\nYesuni opi nya\nUru 'dale 'bua,\n'Ba ini opale 'diyi\nBe tualu.\n\n5. 'Ba dra agapi 'diyi\nMalaika be dria,\nYi ru Munguniri inzu\n'Dani 'dani\nMa Ata pi inzi\nMvi erini pie,\nOrindi Alatararu\nPie indi\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(7) To God be the glory")){
                    String title = "Ongo(7) To God be the glory";
                    String subtext = "1. 'Ba ma inzi Mungu tali 'yepiri,\nFe Mvi lele turi ama e'yosi,\nDrazu pati ruaa onzi 'banisi,\n'Bu tile zizu 'ba dria ofizu.\n\n  Mi inzi Yesuni,ayiko isuzu.\n  Mi inzi Yesuni,'ba dria ma eri;\n  Yi ma emu Ata vu Mvi Yesusi,\n  Mungu tali 'yepiri inzizu fo.\n\n2. Yesu je ama ari inirisi,\nAma asi 'bazu alatararu;\nMi oja mi asi eri a'izu,\nMi nga idri 'dani 'daniri isu.\n\n3. Imbata Munguniri ndri 'doni ya!\nTali 'yele 'diyi amboru 'dopi!\nAma nga ovu ayikosi aga,\nAma ka nga Yesuni ndre 'bua 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(8) Tune:It's me, O lord")){
                    String title = "Ongo(8) Tune:It's me, O lord";
                    String subtext = "Mungu ama Ata,\nAma emu mi inzizu\n(x2)\n\n1. Mini ma lele avasirisi,\nMa emu mi inzizu\n(x2)\n\n2. Mini ma pale onziarisi,\nMa emu mi inzizu.\n(x2)\n\n3. Mini ma agei telerisi,\nMa emu mi inzizu.\n(x2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(9) We come,Lord,to thy feet")){
                    String title = "Ongo(9) We come,Lord,to thy feet";
                    String subtext = "1. Mungu amaniri,\n  Ama emu mi vu;\nMi a'i ama mi vu fo;\n  Ama anzi mini.\n\n2. Ama asi ve ra,\n  Ru mini inzizu;\nMi a'i zita amani\n  Ru Yesunirisi.\n\n3. Mi fe leta mini\n  Ma ga ama asia;\nAzini mi ma imba 'ba\n  Ru mini inzizu\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(10) Jesus,stand among us")){
                    String title = "Ongo(10) Jesus,stand among us";
                    String subtext = "1. Yesu,mi ma so pa\n  Ama ma eselia;\nMi 'ba etu 'diri\n  Alatararu fo.\n\n2. Mi 'ba mi Orindi\n  Ama asia,\nCandi dria drozu\n  Ama vurisi fo.\n\n3. Mi fe okpo mini\n  Ama dri 'dani fo;\nMi pe ama ti ra\n  Azi mini ngazu.\n\n4. Mi fe asi ndriza\n  Ama dri etuzu;\nMi nze ava onzi,\nAle o'di fezu.\n\n5. Mi ce ama dri fo\n  Muzu geri minia;\nAma nga di aci\n  Mi be ayikosi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(11)")){
                    String title = "Ongo(11)";
                    String subtext = "1. Ata amani okporu\nFe ama dri drileba 'bo,\nNyaku,'bu,okpo,ayiko,\nAfa onyiru leta be.\n\n2. Yesu agyi amaniri\nEmu ama eselia;\nBi candi amaniri dria,\nDra onzi amanirisi.\n\n3. Orindi Alatararu\nOvu ama be curu'do;\nEri ama dri ce 'dani,\nEri ama 'ba Yesule.\n\n4. 'Ba ma emu Mungu inzi,\n'Ba ovupi nyakua 'diyi;\n'Ba 'bua 'diyi ma inzu\nAta,Mvi,Orindi pie.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(12) Praise God,from whom all blessings flow")){
                    String title = "Ongo(12) Praise God,from whom all blessings flow";
                    String subtext = "1. Emi inzi Mungu ma ru;\nE'yo ovupi onyiru\nYi enga dria eri vu;\nEmi inzi eri ani.\n\n2. Emi 'ba nyakua 'diyi,\nEmi fi jo erinia;\nEmi emu ayiko be\nEri ma ru inzizu fo.\n\n3. Yesuni Mungu adani,\nEri ama pa onzia;\n'Ba ma inzi eri ma ru\nAngu dria ma alia\n\n4. Orindi Alatararu\nEri ama asi omi;\n'Ba dria ma inzi eri\nDri ceza erinirisi.\n\n5. Emi 'ba nyakua 'diyi,\nEmi inzi Yesuni fo,\nOrindi Munguniri be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(13) Give Glory to the Father")){
                    String title = "Ongo(13) Give Glory to the Father";
                    String subtext = "1 Ama ma inzi Ata\nAfa dria 'Bapiri;\nEri Ata amani,\nAma anzi erini.\n\n2. Ama ma inzi Ata,\nEri ga tre alesi;\nFe drileba ama dri\nMvi iniri alia.\n\n3. Ama ma inzi Mvini;\nEri emu nyakua,\nEri dra pati ruaa\nEzata amanisi.\n\n4. Ama ma inzi Mvini;\nEri enga idriru,\nPa ama dra alia\nFe ama dri idrini.\n\n5. Ama inzi Orindi\nAlatararuri'i;\nEri adri okpo fe\nAzi Munguni ngazu.\n\n6. Ama inzi Orindi\n'Ba asi Omipiri;\nEri 'ba 'ba alaru,\nAma 'bazu Yesule.\n\n7. Ama inzi Mungu ru,\nAta,Mvi,Orindi be;\n'Bu nyakua be tualu\nMa inzi ru Munguni.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(14)")){
                    String title = "Ongo(14)";
                    String subtext = "1. Awa'difo,Ata,mi vu,\nMini ama 'balerisi;\nAma le ongo 'diri ngo\nAmani mi inziria.\n\n2. Awa'difo,Ata,mi vu,\nNyaka mini felerisi;\nAma le ongo'diri ngo\nAmani mi inziria.\n\n3. Awa'difo,Yesu,mi vu,\nMini ama palerisi;\nAma le ongon'diri ngo\nAmani mi inziria.\n\n4. Awa'difo,Yesu,mi vu,\nMini ama lelerisi;\nAma le ongo 'diri ngo\nAmani mi inziria.\n\n5. Awa'difo Orindi vu,\nMi ama 'ba alaruni;\nAma le ongo 'diri ngo\nAmani mi inziria.\n\n6. Awa'difo Orindi vu,\nMi okpo fe ama drini;\nAma Ata pi ru ongo,\nMvi pie,Orindi pie.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(15)")){
                    String title = "Ongo(15)";
                    String subtext = "1. Awa'difo mi vu,\n  Mungu,ama ngo\n    'dani;\nMi 'ye ndra tali ra\n  'Ba mini ma ta mbazu;\nEngazu ndra drio\n  Mi ce ama dri ra;\nMi asi ndriza fe\nKpere andru indi.\n\n2. Mungu afa fepi\n  Ama dri onyiruri,\nMi ovu ama be\n  O'du amani dria,\nAyiko fezu zu\nAsi anzuru be;\nCandi dria alia\nMi te ama agei.\n\n3. Ama mi inzi zu,\nMungu Ata amani,\nMvi miniri pie,\nOrindi miniri be.\n'Ba mini pale 'diyi\nMalaika be dria,\nYi nga mi ru inzu\n'Bua 'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(16) Count your blessings")){
                    String title = "Ongo(16) Count your blessings";
                    String subtext = "1. 'Ba ka afa Munguni feleri ndre\n'Ba ma asisile drozu drinia,\n'Ba yi nga ani ale Munguni va,\nAfa baru erini felerisi.\n\n  Mungu fe ndra Yesu Kristoni,\n  Ndra emu ama opazu ra;\n  'Ba ka Yesu Kristoni a'i,\n  Munguni nga idri'dani'dani fe.\n\n2.Abiri ka di'de ozoo akosi,\nAka Mungu zi,eri nga eri ra,\nEria nga anya fe nyaka dria be;\nKaka osu pie Munguni feni.\n\n3.'Mungu fe ndra Yesu drazu amasi,\n'Fe eri ecandi ama onzisi;\nEri ari ra ra pati ruaa ndra,\nMi ka eri a'i eri mi pa ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(17) Once in royal David's city")){
                    String title = "Ongo(17) Once in royal David's city";
                    String subtext = "1. Ndra aku Daudiniria\n  Mva osi osutaru;\nTe pari omujoa yo,\n  Yi la mvani ase dria;\nAndrini Mariamu,\nOdekua Yesu'i.\n\n2. Ibi enga 'bua 'dale,\n  Esi va nyakua ra;\nKu ndra diza Ataniri,\n  Ovu afu kokoru;\nKristo Opi 'buniri\nOvu 'ba kokorule.\n\n3. Yesu aci'ba eselia\n  Ayikosi,candi be;\nAzo,dra,onzi 'bani be,\n  Ni candi amaniri;\nNga di dra pati ruaa\nOnzi amani wuzu.\n\n4. Candi ka eca ama vu,\n  Ama lu Opi Yesu;\nYesu candi nipi rari\n  Eco 'ba asi omi;\nEri nga ayikofe\nAsi 'bani alia.\n\n5. Ama ngani odekua\n  Yesuni ndre dika ku;\nAma nga eri ndre 'bua\n  Mungu be opiru 'daa;\nAma nga adri 'dani\nRu erini inzizu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(18) Away in a manger")){
                    String title = "Ongo(18) Away in a manger";
                    String subtext = "1. Yesu ka osi ra,\nYi la eri va\nOguru alia,\nLa ase dria.\n'Bi'bio 'bua 'diyi\nLu va eri vu;\nOdekua Yesu\nLa ase dria.\n\n2. Ka tro ovu Opi\n'Buari'i ti,\nOguru alia\nYesu ko o'du.\nE,Yesu,ma le mi,\nMi ovu ma be\nEtuzu ini be\nMi te ma agei.\n\n3. E,Yesu,mi ovu\nOgogo ma vu;\nMi nga ma le'dani\nAsikokoru.\nMi fe asi ndriza\nAnzi dri dria;\nMi ji ama 'bua\nOvuzu mi be\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(19) O little town of Bethlehem")){
                    String title = "Ongo(19) O little town of Bethlehem";
                    String subtext = "1. Aku Betelehemuni,\n  Ini esi mi dria;\nAngu biza ma e'yosi\n  'Ba ndreni angu ku.\nTe angu biza alia\n  Diza 'daniri di,\nMungu eca va nyakua\n  'Ba ma asi 'izu.\n\n2. Mariamu osi Yesu\n  Ini ma alia;\nTe 'bani o'du koria\n  Malaika emu.\nYi olu e'yo bari ra,\n  Yi inzi Mungu ru;\n'Ba kabilo ocepi 'diyi\n  Eri ongo yini.\n\n3. Kristo eca ndindiru tu\n  'Bani ndrekokoru;\nMungu fe drileba 'ba dri\n  Geri ndindirusi.\nAzini kpere andrusi.\n  Ka eri ndre ku ti.\n'Ba onzi ka eri a'i,\n  Kristoni fi yi vu\n\n4. Opi Yesu,Mvi\n    Munguni,\nMi emu ama vu;\nMi fi ama asia fo\n  Onzi drozu amve.\nAma lemi inzi andru\n  'Ba 'bua 'diyi be;\nMi 'ba ama Papiri'i,\n  Opi Yesu Kristo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(20) Silent night")){
                    String title = "Ongo(20) Silent night";
                    String subtext = "1. Ini tili onyi beri,\nYesuni osizuri;\nMalaika ngo ongo 'bua\nOpi Yesu ma ru inzizu,\nYesu Maria ma mva\n(x2)\n\n2. Ini tili onyi beri,\nYesuni emuzuri;\nEri osi odekuaru\nEri la va oguru alia,\nYesu Maria ma mva.\n(x2)\n\n3. Ini tili onyi beri,\nYesuni osizuri;\n'Ba kabilo ocepi 'diyi\nMu Yesu ma odekua\n  ndre,\nYesu Maria ma mva.\n(x2)\n\n4. Ini tili onyi beri,\nYesu emu 'ba pazu;\n'Ba nyakua dri ma emu\nOpi Yesu ma ru inzizu,\nYesu Maria ma mva.\n(x2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(21) While shepherds watched")){
                    String title = "Ongo(21) While shepherds watched";
                    String subtext = "1. 'Ba kabilo ocepi 'diyi\n  Te kabilo agei;\nMalaika eca yi vu\n  Diza be amboru.\n\n2. Yi ovu ani urisi,\n  Te malaika 'yo,\nEmi ru ku,ma di e'yo\n  Ayikoru olu.\n\n3. Andru osi emi dri Mva\n  Aku Daudinia;\nEri Kristo,ama Opi,\n  'Ba 'ba Papiri'i.\n\n4. Yi ombe eri bongosi;\n  Emi nga eri ndre\nAfa tini nyaka nyazu\n  Aleniaria.\n\n5. Yi ndre coti malaika\n  Ongulumuru 'diyi;\nYini Mungu inziria\n  Yi ngo ongo 'diri:\n\n6. Diza ma ovu Mungu vu\n  Uru 'bua ambo;\nAsi anzuru nyakua,\n  Ma ovu 'ba vu zu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(22)")){
                    String title = "Ongo(22)";
                    String subtext = "1. Andra malaika emu\n  E'yo bari ece;\nYesu osilerisi\n  Yi ngo ayikosi:\n    Diza ma ovu Mungu\n    vu,\n    Uru 'bua ambo;\nAsi anzuru nyakua,\n    Ayiko 'ba dri dria.\n\n2. 'Ba kabilo ocepi 'diyi\n  Eri e'yo coti;\nYi mu Betelehemua\n  Yesuni ndrezu ra.\n\n3. Yi ovu ayikosi tu\n  Odekua ndrezu;\nYi fe diza Mungu dri ra,\n  Mu e yoni olu.\n\n4. Yi mvi kabilo yini vu\n  Yi agei tezu ndo,\nTe ayiko Munguniri\n  Ga yi asia tre.\n\n5. E'yo Yesunir ma ku\n  Angu dria alia;\n'Ba Yesuniri ma ku\n  Angu dria alia;\n'Ba Yesuni a'ipi 'diyi\n  Ma ngo ayikosi:\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(23) See amid the winter snow")){
                    String title = "Ongo(23) See amid the winter snow";
                    String subtext = "1. Kabilomva Munguni\nEri osi nyakua\nDaudi ma akua,\nNabini 'yolerile.\n\n  Ongo ayikoniri\n    ama ngo ayikosi;\n  Yesu emu 'ba pazu,\n    ama eri ru inzi.\n\n2. Eri ri andra 'bua\nMalaika drilia;\nEmu osi nyakua,\nLa oguru alia.\n\n3. Kabilo ocepi 'diyi,\nEmi ma olu andru\nE'yo ayikoru tu\nEmini ndreleri'i\n\n4. De ama nyamukoa\nKabilo oceria,\nAma ndre diza ambo;\nEri diza Opini.\n\n5. Malaika Munguni\nYi olu e'yo bari,\nKini,'Ba 'ba Papiri\nOsi andru ama dri.\n\n6. Mva alatararuri,\nAma emu mi vu 'do;\nAma 'yo awa'difo\nAsi ndrizaa minisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(24) Hark,the herald angels sing")){
                    String title = "Ongo(24) Hark,the herald angels sing";
                    String subtext = "1. Emi eri malaika\nYini ongo ngoria:\nDiza ma ovu Mungu vu,\nAsi anzuru 'ba vu.\nSuru dria ma enga ra\nMungu ru inzizu 'dani;\n\n  'Ba dria ma ngo ongo\n  Dizafezu Mungu dri\n  Yini Yesu Kristoni\n  Osile andrurisi.\n\n2. Emi ma inzi Yesuni,Eri Mungu ma Mvani;\nEri eji idri 'ba vu,\nIdri o'diruri'i.\nEri ku diza 'buari,\nOsi 'ba ma dra ku beni;\n\n3. Opi asi anzu e'i!\nEmi ma inzi eri;\nEri angu'i etule\nDiza fezu ama dri.\nEri 'di kile ozoole,\nEfi kazu 'ba asia;\n\n4. Mi 'Ba suruni Leleri!\nMi emu ama vu fo;\nMi efi ama asia,\nMi ofu e'yo onzi;\nMi fe idri o'diruri\nMa enga ama alia;\n  Ama nga di ongo ngo\n  Diza fezu mi dri ra,\n  Yesu,mini osile\nAma asiarisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(25) Angels from the realms of glory")){
                    String title = "Ongo(25) Angels from the realms of glory";
                    String subtext = "1. Malaika 'bua 'diyi,\n  Emi mu angu dri dria;\nEmi olu 'ba ma tia\n  Osita Yesuniri.\n\n  Emi emu\n  Yesu ru inzizu;\n  Emi emu \n  Yesu ma ru inzizu.\n\n2. 'ba kabilo ocepi 'diyi,\n  Emi mu Yesuni ndre;\nMungu eca nyakua 'bo\n  Eri ovu ama be.\n\n3. 'Ba onduaru 'diyi la,\n  Emi ku afa dria,\nEmi mu Yesuni ndrezu,\n  Eri aga afa dria.\n\n4. 'Ba Yesuni tepi 'diyi\n  Emi ma ovu ngonde;\nYesuni nga emvi rugbu\n  Emi o'duzu dria\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(26) O leave your sheep")){
                    String title = "Ongo(26) O leave your sheep";
                    String subtext = "1. Emi 'ba kabilo ocepi 'diyi la,\n  Emi co bile ma vu curu'do:\nEmi ku ja,emi ku azi dria ra,\n  Emi nda Opini;\nOpi,Opi,Opi asi Omipiri!\n\n2. Emi enga muzu Betelehemua,\n  Emi nga di Opi nde isu 'daa.\nMariamu osi odekua ini,\n  Odekua were,\nTe ti,te ti,eri Opi 'buari'i!\n\n3. Emi opi ambo nyakua 'diyi la,\n  Odekua 'diri ma diza tu;\nEri aga diza 'bi'bioniri ra,\n  Emini ndreleri.\nYesu,Yesu,Yesu Opi amaniri!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(27) As with gladness men of old")){
                    String title = "Ongo(27) As with gladness men of old";
                    String subtext = "1. 'Ba onduaru 'diyi\nYi ndre ndra 'bi'bioni;\nYi bi eri ma vuti\nOpi Yesuni ndruzu.\nOpi amani Yesu,\nAma le andru mi ndre\n\n2. Yi mu ndra ayikosi\n'Ba 'ba Papiri ndrezu;\nYi osi kumuti va\nOpi 'buni inzizu.\n'Dinile ama emu\nRU miniri inzizu.\n\n3. Yi fe ndra afa feza\nAje nyapi tu 'diyi.\nAma le yi pamvu'bi\nFeta amanirisi;\nOpi Yesu,ama fe\nAfa amani mi dri.\n\n4. Yesu,ama zi mi tia,\nMi ce ama dri 'dani;\nNyakua 'di ka asi ra\nMi ji ama 'bua fo,\nPari amani diza\nMiniri ndrezuria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(28) Thou didst leave thy throne")){
                    String title = "Ongo(28) Thou didst leave thy throne";
                    String subtext = "1. Yesu,mi ku ndra kiti opini 'bua,\n  Mini emuria masi;\nTe 'ba osini mi jo omunia ku\n  Aku Betehemua.\n\n    Opi,mi emu ma vu fo,\nMi efi asi mania.\n(x2)\n\n2. Malaika inzu ndra ru mini 'bua\n  Mini muria nyakua;\nMi emu nyakua alioru ndindi,\n  Asi mini e'yereru.\n\n3. Te anyapa dri ovu 'bile be ci,\n  Vini aria jorovu;\nTe mi Mungu ma Mva,mi la ndra nyakua\n  Angu Galiliaria.\n\n4. Mi emu,Opi,e'yo idriniri be,\n  'Ba opazu onzi aia;\nOci ekilaza be,oguta be tu,\n  Yi fu ndra mi pati rua.\n\n5. Yesu,mi nga emvi nyakua diza be,\n  Malaika Munguni be;\nMi ka 'ba mi a'ipi 'diyi oku ra,\n  Mi omve ma mi vu indi!\n    Ma nga ovu ayikosi\n    Mini ma omvelerisi.\n(x2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(29) O come,all ye faithful")){
                    String title = "Ongo(29) O come,all ye faithful";
                    String subtext = "1. Emi 'ba adaru ayiko be 'diyi,\nEmi emu Betelehemua;\nEmi emu Opi amani ndrezu.\n\n    Ama ma inzi runi, (2)\n    Ama ma inzi runi,Yesu'i.\n\n2. Mungu adaruri diza dipi turi\nOja i'baru,'du 'ba ma rua;\nEmu ndra 'doa alioru pirini.\n\n3. Malaika,emi ngo runi inzizu,\n'Ba 'bua dria yi ma ngo indi;\nDiza amboru ma ovu Mungu vu.\n\n4. Ama inzi Yesu,osipi andruri,\nAma Opi amaniri inzi;\nMungu ma Mvi 'ba rua o'bipiri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(30) Tune:He rose from the dead")){
                    String title = "Ongo(30) Tune:He rose from the dead";
                    String subtext = "    Yesu emu,emu ndra nyakua; (3)\n    Yesu osi'ba eselia.\n\n1. Ndra Mariamu mu ra Betelehemua; (3)\n  Yesu osi 'ba eselia.\n\n2. Yesufu ovu yi be Betelehemua; (3)\n  Yesu osi 'ba eselia.\n\n3. Malaika ece ndra eri ma diza ra; (3)\n  Yesu osi'ba eselia.\n4. 'Ba kabilo ocepi 'diyi mu eri ndre; (3)\n  Yesu osi 'ba eselia.\n\n5. Yesu emu nyakua ama opazu dria; (3)\n  Eri 'ba ama Papiri'i\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(31) Hark,the glad sound!")){
                    String title = "Ongo(31) Hark,the glad sound!";
                    String subtext = "1. 'Ba 'ba Parini emu ra,\n  'Ba pazu onzia;\n'Ba dria ma a'i eri,\n  Ma ngo ongo indi.\n\n2. Eri emu e'yo bari\n  Oluzu 'ba tia;\n'Ba Satanini bile 'diyi\n  Otruzu dria ra.\n\n3. Yesu emu angu 'izu\n  Pari iniria,\n'Ba mile kokoru 'diyi\n  Ma mile atizu.\n\n4. Emu 'ba asi nyozaru\n  Atizu yikisi;\nEji asi ndriza ambo\n  'Ba alioru vu.\n\n5. Ama ongo ngo nyonasi:\n  Hosana! Hosana!\nOpi asi azuruni,\n  Ama mi ru inzi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(32)")){
                    String title = "Ongo(32)";
                    String subtext = "1. Yesu ovundra Ata ini be,\nYesu ovu ndraAta ini be ra.\n\n    Haleluya,Yesu emu\n    Haleluya,Amen.\n(x2)\n\n2. Yesu ovu ndra diza alia,\nYesu ovu ndra diza alia ra.\n\n3. Yesu ku diza,emu nyakua,\nYesu ku diza,emu nyakua ra.\n\n4. Yesu osi ndra nyakua mvale,\nYesu osi ndra nyakua mvale ra\n\n5. Yesu mu e'yo bari oluzu,\nYesu mu e'yo bari oluza ra.\n\n6. Yesu mu rua 'bani atizu,\nYesu mu rua 'bani atizu ra.\n\n7. Yesu dra pati alaza dria,\nYesu dra pati alaza dria ra.\n8. Yi 'ba Yesuni oni gulea,\nYi 'ba Yesuni oni gulea ra.\n\n9. Yesu enga ra,enga dra alia,\nYesu enga ra,enga dra alia ra.\n\n10. Yesu tu uru,fi 'bua dika,\nYesu tu uru,fi 'bua dika ra.\n\n11. Eri nga emvi 'ba ini 'duzu,\nEri nga emvi 'ba ini 'duzu ra.\n\n12. Ama nga ovu Yesu be 'dani,\nAma nga ovu Yesu be 'dani ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(33) Jesus paid it all")){
                    String title = "Ongo(33) Jesus paid it all";
                    String subtext = "1. Yesu 'yo ndra e'yo 'di,\nOkpo mini 'de yo;\nMi a'i ma etuzu,\nOkpo mani isuzu.\n\n    Mari amani Yesu ofe\n     'bo;\n    Eri ma asi oji,ma ka\n    tro onzi ti.\n\n2. Yesu Mvi Munguniri\nOvu ndra Ata be;\nEri emu nyakua\nMari mani ofezu.\n\n3. Yesu le ma avasi,\nEri ale be tu;\nEri emu nyakua\nIdri mani pazu ra.\n\n4. Yesu dra pati ruaa\nEzata manisi;\nEri dra ma pariaMa truzu onzi alia.\n\n5. Yesu enga dra alia,\nTu uru 'bua ra;\nEri ri ogunga dria,\nEri opi nya 'bua.\n\n6. Yesu Mvi Munguniri\nPa ma onzi alia;\nEri ma dri okpo fe\nE'yo onyiru 'yezu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(34) Tell me the old,old story")){
                    String title = "Ongo(34) Tell me the old,old story";
                    String subtext = "1. Mi nze e'yo Yesuni,\nE'yo drio 'diyi;\nMi 'yo ale Yesuni\nDizaerini be.\nMi 'yo ma dri e'yere,\nMa mva werearu,\nMa 'ba ezata beri,\nOkpo mani 'de yo.\n\n    Mi nze e'yo Yesuni, (3)\n    E'yo drio 'diyi.\n\n2. Mi nze ewa kokoru,\nMani vazu ani;\nOnzeza osutaru\nGeri pataniri\nPaleko kakau;\nE'yo erile 'bori\nAvi ma dri mbele.\n\n3. Mi olu e'yo bari\nMa tia e'yere;\nMa mani 'ba onzini,\nYesu emu ma pa.\nMi olu e'yo bari\nMa tia etuzu,\nKa le asi maniri\nOmizu adaru.\n\n4. Mi nze e'yo Yesuni\nMa bilia 'dani,\nMa kazu muzu kalaa\nYesuni kuzu ku.\nMa ka nga nyaku 'dori\nKu tuzu 'bua ra,\nMi nze e'yo driori:\nYesuni mi pani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(35) Jesus loves me")){
                    String title = "Ongo(35) Jesus loves me";
                    String subtext = "1. Yesu le ma,ma ni ra,\nMa la Buku alia;\nAnzi nyiri erini,\nEri okpo fe yi dri.\n\n    E,Yesu le ma, (x3)\n    Le ma avasi tu.\n\n2. Yesu le ma,eri dra\nE'yo onzi manisi;\nOnzi mani eri wu,\nEri nga ma a'i ra.\n\n3. Yesu le ma,eri nga\nOvu ma be etuzu;\nMa ka ovu azoru\nEri nga ma aza ko.\n\n4. Yesu le ma,fe ma dri\nIdri 'dani 'daniri;\nMa ka dra ra,eri nga\nMa a'i i vu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(36) Iam so glad")){
                    String title = "Ongo(36) Iam so glad";
                    String subtext = "1. Ma ovu ayikosi adaru\nOpi Yesuni ma lelerisi;\nE'yo 'diri ma la Buku alia,\nLeta Yesuniri amboru tu.\n\n    Yesu le ma,le ma avasi,\n    Eri le ma avasi tu;\n    Asi ndriza Yesunirisi,\n    Yesu le ma aga.\n\n2. Yesu Kristo le ma avasi tu,\nLeta eji eri nyakuani;\nLeta e'yosi dra pati ruaa,\nLeta Yesuniri amboru tu.\n\n3. Ezata mani ka ma eza ti,\nYesu kuni ma alenia ku;\nEri ma omve i vu ma pazu,\nLeta Yesuniri amboru tu.\n\n4. Ma ka nga diza Yesuniri ndre,\nMa nga ongo ngori ngo eri dri?\nMa nga ongo ayikoniri ngo:\nLeta Yesuniri amboru tu.\n\n5. Yesu le 'ba dria avasi tu,\nYi ma a'i Opi Yesu ani;\nAma ngadi ongo ngo tualu:\nLeta Yesuniri amboru tu.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(37) One there is above all others")){
                    String title = "Ongo(37) One there is above all others";
                    String subtext = "1. Yesu,agyi amaniri\n  Le ama tu;\nAle erini aga ra,\n  Le ama tu.\nAma agyi nyakua 'diyi\nIci ama,ku ama ra;\n'Ba ama icipi kuri\n  Le ama tu.\n\n2. Yesu,'ba ama Papiri\n  Le ama tu;\nAle erini amboru,\n  Le ama tu.\nNdru ndra ama roko\n  dria,\nEji ama lico alia;\nJe ama aje ambosi,\n  Le ama tu.\n\n3. Yesu,idri amaniri\n  Le ama tu;\nEri ama ma ta mba ra,\n  Le ama tu.\nEri ama asi omi\nAsi ndriza fezu 'dani;\nAma a'i ayikosi,\n  Le ama tu.\n\n4. Yesu,'Ba okpo Fepiri\nLe ama tu;\nAma nga ari'ba aga,\nLe ama tu;\nEri onyi fe ama dri\n'Yeta anzutiri pie;\nEri nga ama ji i vu,\nLe ama tu\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(38) The great physician")){
                    String title = "Ongo(38) The great physician";
                    String subtext = "1. Ojoou adari Yesu'i,\n   Eri ama be 'doa.\nDra ka mi rua 'ye onzi,\n  Mi mu coti ojoou vu.\n\n    Ru nyakua aluzaru,\n    Ru ndrizaru 'bua\n      tu,\n    Ru ndrizaru aga ra:\n    Yesu, Yesu, Yesu.\n\n2. Azo ka fi mi ruaa tu,\n  Yesu ovu tali be;\nEri le azo mini dro,\n  Le mi ati alaru.\n\n3. Onzi ka fi mi asia,\n  Yesu ni e'yo dria;\nMi e'da onzi Yesu tia,\n  Eri nga onzi wu ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(39) Tune:The Old-Time Religion")){
                    String title = "Ongo(39) Tune:The Old-Time Religion";
                    String subtext = "1. E'yo Yesuni amboru,(3)\nYesu fu dri ci ada.\n\n2. Yesu emu 'ba eselia,\nEri dra ama opazu,\nEzata amani wuzu;\nYesu fu dri ci ada.\n\n3. Yesuni ama agei te,\nEri ama dri okpo fe,\nEri ama dri ce 'dani;\nYesu fu dri ci ada.\n\n4. Eri candi 'bani 'du ra,\nEri 'ba azo ati ra,\nEri ayiko fe 'dani;\nYesu fu dri ci ada.\n\n5. Yesuni ama ta mba ta mba ra,\nYesu aga okpo drani,\nEri nga ama ji 'bua;\nYesu fu dri ci ada.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(40) All glory,laud,and honour")){
                    String title = "Ongo(40) All glory,laud,and honour";
                    String subtext = "1.Diza pi inzita be,\n  Mi vu,Opi Yesu;\nAnzi inzi ndra mini,\n  Yi ngo Hosana ra.\n\n2. Mi dra pati ruaa ra,\n  Mi Mva Daudini;Mi emu Ata rusi,\n  Mi Opiopini.\n\n3. Malaika yi dria\n  Ru mini inzu tu;\n'Ba mini o'bale 'diyi\n  Yi mi inzi indi.\n\n4. 'Ba ndende bi be dria,\n  Yi mu ndra mi drilia;\nAja yi bongo geria,\n  Mi ru inzizu tu.\n\n5. De nga 'ba bini mi ku,\n  Yi inzi ru mini;\nAma ongo ngo 'dani\n  Mi dri ayikosi.\n\n6. Mi a'i ongo yini,\n  Te amani indi;\nMi 'Ba onyi Lepiri,\n  Mi Opi 'buari.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(41) There is a green hill")){
                    String title = "Ongo(41) There is a green hill";
                    String subtext = "1. Oni Yerusalemua,\n  Amve aku ma tia,\nPari Yesuni dizuri;\n  Dra ama pazu indi.\n\n2. Ama nini eri rua\n  Su ngopi yari ku;\nTe ama a'i eri dra,\n  Nya candi amasi.\n\n3. Eri co adi amani,\n  Wu onzi amani;\nAma ma ovu onyiru,\n  Muzu ani 'bua\n\n4. 'Ba funi dri aluni ku\n  Arioti ofezu,\nTe Yesu a'dule eco\n  'Ba ofi 'buani.\n\n5. Yesu le ama avasi,\n  Dra ama opazu;\nAma ma a'i eri ra,\n  Ama ma le eri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(42) Weeping will not save me")){
                    String title = "Ongo(42) Weeping will not save me";
                    String subtext = "1. Candi pani ma ku;\nMa ka tro wu 'dani ti\nE'yo onzi manisi,\nMa mindre econi ku.\nCandi pani ma ku.\n\n    Mvi Munguni dra\n      masi,\n    Eri Yesu Kristo'i;\n    Eri dra pati ruaa.\n    Yesuni ma pani.\n\n2. Azi pani ma ku;\nMa ka azi nga 'dani\n'Yeta adani 'yezu,\nFeni pata ma dri ku.\nAzi pani ma ku.\n\n3. Tezu pani ma ku;\nMa avi onzi 'bo,\nMa ka E'yo Ba eri,\nMa ka te ra,ma nga dra.\nTezu pani ma ku.\n\n4. Zizu pani ma ku;\nMa ka Mungu a'i zu,\nZita mani econi\nMa pazu onzia ku.\nZizu pani ma ku.\n\n5. Yesuni nga ma pa;\nMa ma a'i eri ra\nErini dralerisi,\nMa ma nzu vunia ka!\nYesuni ma pani.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(43) Near the cross")){
                    String title = "Ongo(43) Near the cross";
                    String subtext = "1. Yesu,drata miniri\n  Eri diza mani;\nAri mini rapiri\n  'Ba onzi atini.\n\n    Yesu'i, Yesu'i,\n    Yesu,pati mini\n    Eri diza maniri\n    Andru,'dani 'dani.\n\n2. Pati mini etia\n  Ma le adri 'dani;\nMa 'ba onzi 'yepiri\n  A'i pata mi dri.\n\n3. E'yo onzi mani dria\n  Di mi pati ruaa\nYi fe candi mi dri tu,\n  Mi dra ma paria.\n\n4. Kabilomva Munguni,\n  Ale mini aga;\nMa esi mi vu ani\n  Asi ndriza ndruzu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(44) Precious,precious blood")){
                    String title = "Ongo(44) Precious,precious blood";
                    String subtext = "1. Ari Yesuni a'dule\n  Andra rapi 'bo\n'Ba onziru 'diyisiri;\n  Ra ndra misi.\n\n    Ari Yesuni a'dule\n    Ndra rapi 'bori,\n    Mi ma a'i ari nderi\n    Ra ndra misi.\n\n2. Ari Yesuni a'dule\n  Onzi ojini;\nAri onzi ojizuri\n  Ra ndra misi.\n\n3. Mi onzi ka tro o'biru,\n  Mi ka eza tu,\nAri Yesu Kristoniri\n  Ra ndra misi.\n\n4. Ari Yesuni a'dule\nEco mi pani,\nMini tuzu ani 'bua;\nRa ndra misi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(45) When I survey the wondrous cross")){
                    String title = "Ongo(45) When I survey the wondrous cross";
                    String subtext = "1. Ma ka pati alaza ndre,\n'Bani Yesuni dizuri,\nMa afa mani ndre toko,\nMa afu mani ngu onzi.\n\n2. Ma ma ovu afusi ku\nPe lu pati Kristonisi;\nE'yo mani lele 'diyi\nMa ku yi dria Yesusi.\n\n3. Mi ndre rua eriniri\nOfu ariru amasi;\nA'i oku oci beri\nErini 'ba lelerisi.\n\n4. Afa dria nyakua 'diyi\nCani fezu Yesu dri ku;\nAle Yesuni e'yosi,\nLe ma fe ma Yesu dri pi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(46) When wounded sore the stricken heart")){
                    String title = "Ongo(46) When wounded sore the stricken heart";
                    String subtext = "1. 'ba ma asi ka oti tu\n  Ezata inisi,\nLu ari Yesuni eco\n  Yi asi ojini.\n\n2. Candi ka 'ba ma asi bi,\n  Mindreni ka ra ra,\nAsi alu yiki beri\n  Nga 'ba asi omi.\n\n3. Yesu ma ari a'dule\n  'Ba oji alani;\nEri eco candi ati\n  Ayiko fezu ra.\n\n4. E Yesu,ari miniri\n  Ma oj ma asi;\nMa di emu mi vu,opi,\n  Mi 'ba ma alaru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(47) It is a most wonderful")){
                    String title = "Ongo(47) It is a most wonderful";
                    String subtext = "1. Mani ma asi droria\n  E'yo Yesu Kristoni dria,\nMa osu tu ma ka ega\n  Mvi Munguniri dra masi.\n\n2. Yesu ku diza 'buari\n  Erini ma lelerisi;\nKa tro Mungu ma Mvani ti,\n  Dra ma pazu onzi alia.\n\n3. Eri ndra 'bua kariru,\n  Te nyakua 'ba tokoru;\nEri nga azi candi be,\n  'Ye dria leta e'yosi.\n\n4. Ale Yesuni zo ma ra,\n  Ma mani 'ba onziru tu;\nYesu ma ale aga dria,\n  Yesu le ma avasi tu.\n\n5. Mani dratani egaria\n  Ma ani ma mile bi ci,\nMa asisile mani dro\n  Pati Yesuniri ndrezu.\n\n6. Ma ka tro dratani ndre ti,\n  Econi mani letani\nVazaru teketeke ku;\n  Letaniri amboru tu\n\n7. Yesu,mi le ma avasi,\n  Te leta mani were tu;\nMi fe ale ma asia\n  Ava mini ma va ma tu.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(48) I gave my life for thee")){
                    String title = "Ongo(48) I gave my life for thee";
                    String subtext = "1. Ma fe idri mani,\n  Ma ari ra misi;\nMa dra mi paria,\n  Idri fezu mi dri;\nMa fe ma idri;\nMa fe ma idri dria,\nMi ma dri a'di fe?\n\n2. Ma ku angu 'bua,\n  Parindrizaruri;\nMa eca nyakua\n  Acizu candi be;\nMa ku diza misi,\nMi a'di ku masi?\n\n3. Ma rua su ndra tu,\n  Aga 'yozani ra;\nYi co ndra ma misi,\n  Mi pazu onzia\nMa 'ye mi dri 'dipi,\nMi 'ye ma dri ngopi?\n\n4. Ma je pata mini\n  Ndra pati ruaa 'daa;\nMa fe asi ndriza,\n  Ma ava ecezu;\nMa fe mi dri ambo,\nMi fe ma dri ngopi?\n\n5. Opi,idri mani\n  Ma ovu mini fo;\nMa le mi aga dria\n  Ale minirisi;\nMi fe mi masi 'bo,\nMa fe ma pi mi dri.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(49) Tune:When Israel was in Egypt's land")){
                    String title = "Ongo(49) Tune:When Israel was in Egypt's land";
                    String subtext = "1. Yesu dra pati ma ruaa,\n  Ama opazu;\nEri fe idri iniri,\n  Ama opazu.\n\n    Ama inzi 'Ba ama\n      Papiri;\nEri dra ra ama\n      opazu.\n\n2. Co adi amaniri 'bo,\n  Dra inirisi;\nOfe mari amaniri\n  Dra inirisi.\n\n3. Yesu eji 'ba Mungu vu\n  Dra inirisi;\nEri ama asi ati,\n  Dra inirisi.\n\n4. Yesu aga Satani ra,\n  Dra inirisi;\nTru ama onzi alia,\n  Ama opazu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(50) Jesus lives")){
                    String title = "Ongo(50) Jesus lives";
                    String subtext = "1. Yesu eri idriru!\n  Okpo draniri di'deyo;\nYesu idriru ada,\n  Nyadri ngani ama ki\n     Ku.\nHaleluya!\n\n2. Yesu eri idriru!\n  Eri jotile idrini;\nAma nga idri isu,\n  Ama ka nga fi erisi.\n\n3. Yesu eri idriru\n  Ama ma bi eri vuti,\nDiza fezu eri dri,\n  Ovuzu alatararu.\n\n4. Yesu eri idriru!\n  Eri le ama avasi;\nEri nga ama ta mba\n  Nyakua azini 'bua.\n\n5. Yesu eri idriru!\n  Eri ri Opiru 'bua;\nAma nga mu eri vu,\n  Ovuzu eri be 'dale.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(51) The strife is o'er")){
                    String title = "Ongo(51) The strife is o'er";
                    String subtext = "Haleluya,Haleluya,\n      Haleluya!\n\n1. Omba de i iriti ra,\nYesu nde e'yo onzi dria.\n  Ama ma ngo ayikosi:\n  Haleluya!\n\n2. Yesu nde okpo drani ra,\nEnga idri o'diru be.\n\n3. Yesu enga dra alia,\nEnga ra o'du narisi.\n\n4. Yesu e'da i idriru\n'Ba ini imbale 'diyivu.\n\n5.Yesuni opi nya 'bua\nDiza Munguni alia.\n\n6. Yesu fe okpo ama dri,\nAma truzuSatanidria.\n\n7. Yesu fe idri ama dri,\nIdri 'dani 'daniri'i.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(52) Haleluya,Hallelujah")){
                    String title = "Ongo(52) Haleluya,Hallelujah";
                    String subtext = "Haleluya,\n    Haleluya!\n\n1. Emi inzi asisi;\nEmi inzi ru Munguni\nOngo ayikonisi.\n'Ba fu Yesuni amasi,\nEri enga idriru;\n'Ba ma pa yi onzi alia\nIdri isuzu beni.\n\n2. Yesu aga dra ada;\nEri opi dra ma ti ci\nIdri fezu ama dri.\nYesu efu gule alia,\nAma nga enga indi;\nEri tu di uru 'bua,\nAma nga tu eri vu.\n\n3. Yesu ede geri 'bo;\n'Ba Yesu a'ipi 'diyi\nNga fi erisi 'bua.\nYesu Kristoka emvi ra,\nEri nga ama omve\nOvuzu eri be 'dani\nDiza 'buni alia.\n\n4.Yesu enga gulea.\nAta eri engapiri,\nAma ru mini inzi;\nYesu,'Ba dra Agapiri,\nDiza ma ovu mi vu;\nOrindi Alatararu,\nAma mi inzi indi\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(53) Jesus Christ is risen to-day")){
                    String title = "Ongo(53) Jesus Christ is risen to-day";
                    String subtext = "1. Yesu Kristo enga andru,Haleluya!\nO'du 'dori ayikoru,Haleluya!\nUri drani de i 'bo,Haleluya!\nAma ngo ayikosi,Haleluya!\n\n2. Yite gule agei ti,\nKristo ce anziriku 'bo,\nOkpo Yesuni aga;\nEnga nyadri ma alia.\n\n3. Yesu de azi ini dria,\nMaria amani ofezu;\nEri nde e'yo onzi,\nAga dra ma okpo dria.\n\n4. Yesu enga idriru ra,\nEji idri ama drini;\nEri andru 'bua ci,\nAma nga fi 'bua ra.\n\n5. Ama Yesu ru inzi tu,\nEngata erinisi,\nPa ama dra alia;\nAma ngo ayikosi.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(54) Low in the grave he lay")){
                    String title = "Ongo(54) Low in the grave he lay";
                    String subtext = "1.Yesul la gulea,\n  'Ba ma Papiri;\nEri la o'du na,\n  Opi Yesu.\n\n    Yesu enga gulea,\n    Eri aga juru ini'bo;\n    Eri enga okpo drani\n      agazu,\n    Dra asini eri bizu\n      dika ku;\n    Enga ra,enga ra,\nHaleluya Yesu dri!\n\n2. 'Ba yi gu oni ci\n  Gule ma tia,\nAgeini tezu ti;\n  Opi Yesu.\n\n3. Dra o'bi eri ti,\n  'Ba ma Papiri;\nAga okpo drani,\n  Opi Yesu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(55) This joyful Eastertide")){
                    String title = "Ongo(55) This joyful Eastertide";
                    String subtext = "1. Andru ayiko tu!\nCandi e'yo onzini nga asi ra;\n'Ba ama Lepiri\nEri enga andru,eri idriru.\n\n  Ka ndra enga 'de ku\n  Nyadri ma aliarisi,\n  Ama te ti,toko\n  Opi Yesu enga 'bo,andru.\n  Enga 'bo,enga 'bo,\n    Enga...'bo andru.\n\n2. Rua amani nga\nLa 'bile alia ewu weresi,\nOrindi amani\nEnga ra,ovuzu eri be 'bua.\n\n3. Dra uri fepiri\nYesu aga okponi ra,iriti.\nYesu le ama tu,\nEri ovu ama be 'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(56)")){
                    String title = "Ongo(56)";
                    String subtext = "1. Ama asi ovu ayikosi,\n  Yesu enga,enga di'bo;\nAma emu kumuti osizu,\n  Yesuni inzizu.\n\n    Opi Yesu enga di'bo\n    Ama aza kozu;\n    Opi Yesu enga di'bo,\nAma eri inzi.\n\n2. Yesu enga gule ma alia,\n  Eri enga ama pazu;\n'Ba 'wara anzi be dria ma ngo,\n  Yesuni inzizu.\n\n3. Ama adriza onziri ku ja,\n  Asi ndriza Yesunisi;\nEri adriza onyiruri fe;\n  Ama eri inzi.\n\n4. Mungu enga Opi Yesu andru\n  Nyaku ma onzi edezu;\n'Ba ma emu asi driasi fo\n  Yesuni inzizu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(57) Crown him with many crowns")){
                    String title = "Ongo(57) Crown him with many crowns";
                    String subtext = "1. Ama inzi Yesu,\n'Ba opi Nyapiri;\nKabilomva Munguniri\nDra ama pazu dria.\nOrindi mani la,\nMi ngo ayikosi\nOngo Yesuni inzizu\nKpere 'danj 'dani\n\n2. Ama inzi Yesu,\n'Ba dra Agapiri\nEnga di nyadriarisi,\nPa ama dra alia.\nAma eri inzi,\n'ba 'bua 'diyi be;\nDra idri fezu ama dri,\nEnga dra agazu.\n\n3. Ama inzi Yesu,\n'Ba kari Nyapiri;\nRi 'bili opini dria\nAngu ;buaria.\nEri ama dri ce\nAsi anzurusi;\nAma ma inzi eri ru,\nYesu ama Opi.\n\n4. Ama inzi Yesu,\n  Eri leta E'i;\nMi ndre ejeni pani be,\nArini ra misi.\nAma mi inzu tu,\n'Ba 'ba Papiri la!\nAma nga ru mini inzi\n  Kpere 'dani 'dani\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(58) He rose from the dead")){
                    String title = "Ongo(58) He rose from the dead";
                    String subtext = "Yesu(Yesu),enga (enga),enga dra alia. (3)\nEri tu uru,fi 'bua ra.\n\n1. Yesu 'ba ma Papiri,\nYi fu ndra eri ra.\nEri tu uru,fi 'bua ra.\n(x3)\n\n2. Yesu 'Ba ma Papiri,\nYi 'ba eri gulea.\n(x3)\n\n3.Yesu 'ba ma Papiri\nRi di ogunga dria\n(x3)\n\n4. Yesu 'Ba ma Papiri\nEde pari ma dria.\n(x3)\n\n5. Yesu 'Ba ma Papiri\nNya emvi nyakua.\n(x3)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(59)")){
                    String title = "Ongo(59)";
                    String subtext = "1. Malaika dria ovupi 'bua\n  Mungu ru inzipi etuzu 'diyi,\nYi ongo ngo 'dani Opi Yesu dri;\n  Eri tu uru,fi 'bua 'dale 'bo.\n\n  'Ba ma inzi Yesu ayikosi fo!\n  Eri tu uru,fi 'bua 'dale 'bo.\n\n2. Yesu Kabilomva Munguniri'i,\n Eri fe edeta e'yo onzisi;\nKini i de azi ini nyakua;\n  Eri tu uru,fi 'bua 'dale 'bo.\n\n3. Dra pati ma ruaa ama opazu,\n  Je ama Mungu dri ari inisi;\nEri fu dri buku idrini zizu;\n  Eri tu uru,fi 'bua 'dale 'bo.\n\n4. Yesu yini ndrele turia ndrari\n  Eri nga emvi ra malaika be;\nEri nga 'ba ini 'diyi o'du dria,\n  Yi nga tu uru ra Yesu vu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(60)")){
                    String title = "Ongo(60)";
                    String subtext = "1. Yi su ndra oku ocini\n  Yesu ma dria ra,\nTe curu'do uru 'bua\n  Su opiniri'i.\nMalaika 'dale 'bua\n  Yi eri ru inzu,\n'Yo Kabilomva fu dri ra\n  Inzita a'izu.\n\n2. Yi fe diza pi eri dri\n  Inzita be dria,\nYesuni 'ba opa ari\n  Inirisirisi;\nJe Mungu Ata ini dri\n  'Ba suruti dria,\n'Ba yi kuhaniru 'bua\n  Mungu ma milia.\n\n3. 'Ba fupi candi amboru\n  Ma alia 'diyi,\nBongo ojipi emveru\n  Yesu arisi 'diyi,\nYi ovu Yesu be 'bua\n  Eri inzizu zu;\nYesu 'Ba yi Ocepiri\n  Eri yi dri ceni.\n\n4. 'Ba Yesuni opale 'diyi\n  Yi eri ru inzu\nMalaika pie dria\n  'Bua 'dani 'dani.\n'Ba wudrikuru dria 'diyi\n  Ma inzi eri fo,\nDiza fezu eri dri zu\n  'Ba 'bua 'diyile.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(61) When the roll is called")){
                    String title = "Ongo(61) When the roll is called";
                    String subtext = "1. Nyaku 'diri ka i de ra,\n  Yesu Kristo ka emvi,\nAnzi Munguni ka yi oku 'bua,\n  'Ba drapi 'diyi ka enga\n  Tuzu uru Yesu vu;\nMa le mani ma ma mu 'dale indi.\n  Yesuni buku ti ziria,\n  'Ba Yesuni ka enga ra,\n  Yesuni 'ba okuria,\nMa le mani mama mu 'dale indi.\n\n2. Mi ka Yesuni a'i ra,\n  Eri nga mi idri pa;\nMi ngani emvita erini ru ku.\n  'Ba ka Yesu Kristo ga si\n  Yi ngani idri ndre ku;\nAdra Munguniri yi ruaa 'dani.\n\n3. De nga etu ace indi\n  Ama mu e'yo olu;\n'Di e'yo Munguni ama lezuri.\n  Azi e'yo oluzuri\n  Ka i de ra nyakua,\nMunguni nga ama 'du i vu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(62)")){
                    String title = "Ongo(62)";
                    String subtext = "1. Yesu 'ba nyaku Papiri\n  Emu ndra nyakua ra;\nCuru'do Yesuni 'bua\n  Pari edezu 'ba dri.\n\n    Yesuni nga emvi dika\n    Ama jizu 'bua 'daa;\n    Ace were Yesuni nga\n    Ama 'du ji i vu 'daa.\n\n2. 'Ba ka te eli kakau ti,\n  Yesu 'yo ndra 'ba ma tia,\nEtu 'bani nile kuria\n  Mvi 'baniri nga emu.\n\n3. Yesu fe azi ama dri\n E'yo bari oluzu;\nEri ama dri okpo fe\n  Idri ejizu 'ba vu.\n\n4. Yesu,mi ko ma aza fo,\n  De nga ma nyakua ci;\nMa eco ani 'ba lezu\n  Mini yi lelerile.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(63) When he cometh")){
                    String title = "Ongo(63) When he cometh";
                    String subtext = "1. Yesu Kristo ka emu ra\n  'Ba ini okuzu,\nEri anzi ini ji ra\n  Aku Mungunia.\n\n    Yi nga ovu 'daa 'bua\n    Opi Yesu be 'dani;\n    Yi nga ovu etuzu\n    Aku Mungunia.\n\n2. Anzi dria,anzi dria\n  Yesu a'ipi 'diyi,\nYi nga tu ra 'bua uru\n  Rizu Yesu be.\n\n3. Yesu Kristo ka emvi ra,\n  'Ba 'duzu i vu ra,\n'Ba azini ka a'i ra,\n  Yi yu Yesu vu.\n\n4. Ama dria,ama dria\n  Nga ovu Yesu be;\nEde pari ama dri 'bo;\n  Aku Mungunia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(64) On the resurrection morning")){
                    String title = "Ongo(64) On the resurrection morning";
                    String subtext = "1. O'du Yesuni emvizu\n  Nyakuari amboru;\nEri nga ama oku ra\n  I vu dria.\n\n2. Drani nga ama esele\n  Co ewu wererisi;\nAma nga ama adripi\n  Ndre dika.\n\n3. Te 'ba drapi Yesu alia\n  'Diyi nga enga oko,\nYesu Kristo ka nga emvi\n  Nyakua\n\n4. 'Ba acepi ra nyakua\n Yesuni a'ipi 'diyi,\nEri nga yi oku dria\n  'Bua ra.\n\n5. O'du 'darisi ayiko\n  Amaniri nga aga,\nAma ka nga Yesuni ndre\n  'Bua ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(65)")){
                    String title = "Ongo(65)";
                    String subtext = "1. Yesuni nga i e'da ra\n  Iriti ma alia;\nNga 'ba ini o'du dria\n  Ovuzu i be 'bua\n    Haleluya,Haleluya,\n    Haleluya Yesu dri.\n\n2. Yi nga fi 'bu ma alia,\n  Bongo emve be ruaa;\nAku nde dizaruria\n  Yi nga Yesu ruinzu.\n\n3. 'Ba kule nyakua 'diyi\n  Nga ovu candiru tu;\nYi ka tro wu mindresi ti\n  Yi econi yi pa ku.\n    Yi nga wu ra,yi nga wu ra,\n    Yi nga wu ra candisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(66) When morning comes")){
                    String title = "Ongo(66) When morning comes";
                    String subtext = "1. E'yo ka ama o'bi,ama anzi Munguni,\n  Candi ka ama isu geri 'buaria ti,\nE'yo candiru dria nga yi de 'dale 'bua,\n  Ama ka ca 'dale 'bua Mungu vu.\n\n    Etuzu 'bua 'dale,\n    Ama ka ca 'dale dria 'bo,\n    Ama nga ongo ongo ayiko be,\n    Ama ka ca 'dale 'bua Mungu vu.\n\n2. Ava 'buni ama va,ama anzi Munguni;\n  Ama ka angu 'di ku,muzu ur Yesu vu,\nAma nga di ayiko ndre 'bua 'dani 'dani,\n  Ama ka ca 'dale 'bua Mungu vu.\n\n3. Dra 'ba rua fupiri ma okpo nga i de ra,\n  Yesu ka ama oku ama 'duzu 'bua 'bo;\nAma ngani owu ku,mindreni nga ovu yo,\n  Ama ka ca 'dale 'bua Mungu vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(67) Till he come")){
                    String title = "Ongo(67) Till he come";
                    String subtext = "1. Emi 'ba emi mile\nUruleru etuzu,\nYesuni nga emvi ra;\nE'yo teza 'diri nga\nAma asi omini,\nKpere emvitania.\n\n2. Yesuni nga emvi ra,\nAma dria okuzu;\nAma agyi ka dra ra,\nAma ma ga lulu ku;\nAma nga yi ndre dika\nYesuni emviria.\n\n3. Ama ka candi nya ti,\nYesuni nyalerile,\nDe ama nyakua ra\nAma asi teza ci;\nCandini nga i de dria,\nYesuni emviria.\n\n4. Ama ma nya omuni,\nTi ecita erini;\n'Di eceta Yesuni\nErini feleri'i;\nAma ma ega eri\nDe eri emvini ku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(68) Thy kingdom come,O God")){
                    String title = "Ongo(68) Thy kingdom come,O God";
                    String subtext = "1. Yesu,suru mini\n  Ma emu nyakua,\nMa ce 'ba dri dri\n  E'yo onzi kuzu.\n\n2. Mi asi anzu le\n  E'yo adaru be;\nAma ma ku nguta\n  Ma'yala pie ja.\n\n3. Mi 'yo ndra 'ba tia\n  Kini mi nga emvi\nNyakua diza be,\n  'Ba mini okuzu.\n\n4. Yesu e'yo mini\n  Azile ndra 'diyi\nYi 'ye a'dungare?\n  Ama yi te te fo.\n\n5. 'Ba yi mi ru ede,\n  'Ba mini inzazu;\nMi emu ama vu\n  Ama arizu fo!\n\n6. Angu bi iniru\n  Ca oro drisi dria;\nMi emu ama vu,\n  Mi diza nyakuni.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(69) Come,let us join our cheerful songs")){
                    String title = "Ongo(69) Come,let us join our cheerful songs";
                    String subtext = "1. Ama emu ongo ngozu\n  Yesuni inzizu;\nMalaika be tualu\n  Ama ma ngo ongo.\n\n2. Malaika 'bua 'diyi\n  Ma kalafe kakau;\nTe ayiko yini alu:\n  Yesu ru inzuzu.\n\n3. Yesu ma ru 'bazu uru\n  Ovu onyiru tu;\nAma ma inzi eri ru,\n  Eri dra amasi.\n\n4. Yesu fudri inzita pi\n  Isuzu diza be;\nYesuni Ata be alu\n  Diza 'buaria.\n\n5. 'Ba Munguni o'bale 'diyi\n  Ma eci ti dria,\nKabilomva Munguniri\nMa ru inzizu zu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(70) All hail the power of Jesus' name")){
                    String title = "Ongo(70) All hail the power of Jesus' name";
                    String subtext = "1. Mi inzi ru Yesuni tu,\n  Malaika pie;\nYesu Opi amaniri;\n  Mi inzi,inzi,inzi,\n  Mi inzi runi.\n\n2. 'Ba onzi ndepi driari\n  Dra pati ruaa ra;\nMi 'ba mi asi eri dria.\n\n3. 'Ba Yesuni opale 'diyi\n  Ma inzi eri tu;\nEri asi ndriza e'i.\n\n4. 'Ba angu dri dria 'diyi\n  Ma inzi eri ru,\nMalaika be tualu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(71)")){
                    String title = "Ongo(71)";
                    String subtext = "1. Inzizu 'di efu asi amania\nE'yo pata Yesu Kristonirisi;\nYesu dra ezata 'bani ma e'yosi.\nPata eri indi,mi inzi Yesu.\n\n    Mi inzi Yesu,mi inzi Yesu;\n    Pata eri indi,mi inzi Yesu\n(x2)\n\n2. Inzitani candi dro 'ba asia ra,\nAyiko ejizu candi paria;\nYesu eji diza,ini aga di'bo.\nPata eri indi,mi inzi Yesu.\n\n3. E'yo ewaru 'diyi 'ye 'ba kakau onzi,\nYi isu candi amboru nyakua;\nTe ama'iruni,ama inzi Mungu,\nEri adri ama aza ko 'dani.\n\n4. Satani le 'ba obe inzosi 'doa,\nEri le a'ita nze ama asia;\nInzizu 'di ovu aju amaniri.\nPata eri indi,mi inzi Yesu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(72) O brothers,lift your voices")){
                    String title = "Ongo(72) O brothers,lift your voices";
                    String subtext = "1.Emi ngo ayikosi,\n  Adripi mani dria;\n'Ba nyakua ma inzi\n  Yesu Kristo ma ru.\n'Ba eri ndrepi ku 'diyi\n  Yi runiri inzi,\nYi ayiko isu ra,\n  Ru erinisi.\n\n2. Emi enga,adripi,\n  Emi dro onzi re;\nOpi Yesu aga 'bo\n  Drata inirisi.\nYesuni nga okpo fe,\n  Eri okpo e'i;\nAma nga aga ani\n  Okpo erinisi.\n\n3. Yesu,'ba 'ba Papiri,\n  Ama mi ru inzi;\nMi fe ama aga\n  Drata minirisi.\nMi aga ndra Satani,\n  Juru amaniri;\nAma ka mi vuti bi,\n  Ama aga indi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(73) Come,sing with holy gladness")){
                    String title = "Ongo(73) Come,sing with holy gladness";
                    String subtext = "1. Emi emu ayikosi\n  E'yo Yesunisi;\nEmi ngo ongo avasi,\n  Runiri inzizu.\nAgianzi,emi emu\n  Ongo emini ngo;\nEzoanzi,emi emu\n  Ru Yesuni inzi.\n\n2. Agianzi,emi ma ngo\n  Yesu meleki vu;\nE'yoni onyiru ada,\n  Anzini inzizu.\nYesu pata amaniri\n  Dra ama opazu;\nAnzi pi ezoanzi be\n  Ma inzi eri ru.\n\n3. Agianzi,emi ma nga\n  Azi asisi dria,\nYesuni ndra 'yelerile\n  De eri nyakua.\nEzoanzi,emi ma zo\n  Leta avasi be;\nLe emi ovu e'yere\n  Asi anzuru be.\n\n4. Ace were anzi yi nga\n  Avi uru 'bua;\nYi nga ovu ayikosi\n  Kpere 'dani 'dani.\nYesu,mi ma ede ama\n  Fizu akua 'daa,\nOvuzu mi be 'dani zu\n  Ru mini inzizu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(74) Come,ye that love the Lord")){
                    String title = "Ongo(74) Come,ye that love the Lord";
                    String subtext = "1. Ba Kristo lepi 'diyi\n  Ovu ayikosi;\nYi ongo ngo ayikosi, (2)\n  Yi Yesu ru inzi. (2)\n\n    Ama le mu 'bua\nAngu ndrizaru turia;\nAma aci 'bua 'dale,\nAngu ndrizaru turia.\n\n2. 'Ba ka Mungu ni ku,\n  Yi leni ongo ku;\nTe 'ba Yesu a'ipi 'diyi (2)\n  Ma ngo ongo 'dani.(2)\n\n3. Afa oyiru tu\n  Mungu fe ama dri,\nDe nga ama nyakua ci, (2)\n  Ale erinisi. (2)\n\n4. Ama ngani wu ku,\n  Ama ayikoa,\nAcizu Yesu be zu zu, (2)\n  Muzu 'bualeru. (2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(75)")){
                    String title = "Ongo(75)";
                    String subtext = "1. Yesu emu ndra 'ba pazu,\n  'Ba onzi 'yepi 'diyi;\nEri dra pati ruaa ra,\n  'Ba dria opazu.\n\n    Mi inzi Opi Yesu tu,\n    Letaniri ambo;\n    Ma ovu ayikosi tu,\n    Pata Yesunisi.\n\n2. Ari mini ra amasi,\n  Wu onzi amani;\n'Ba mi agapini 'de yo,\n  'Ba asi ojizu.\n\n3. E,ama funi dri cazu\n  'Bua aluni ku;\nTe Yesu,yiki minisi\n  Ama nga ca 'dale.\n\n4. Yesu,'Ba ama Papiri,\n  Mi nga ama a'i;\nMi nga ama dri ce 'bua\n  Leta minirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(76) I will sing the wondrous story")){
                    String title = "Ongo(76) I will sing the wondrous story";
                    String subtext = "1. Ma le Yesu ru inzizu\n  Erini dralerisi;\nEri ku diza Atani\n  Ama pazu arisi.\n\n    Ama le ngo ayikosi\n    Yesuni dralerisi;\n    Eri le 'ba onzi dria,\n    Dra ama opazuni.\n\n2. Ndra ma 'a onzi alia,\n  Ma a'ini Yesu ku;\nUri bi ma asi ceni,\n  Asi anzu mani yo.\n\n3. Ndra ma ovu dra alia\n  E'yo onzi manisi;\nTe Yesu fe mani idri,\n  Idri depi kuri'i\n\n4. Ndra ma ovu avizaru,\n  Ma aci ini alia;\nTe Yesu fe mani diza,\n  Acizu etu alia.\n\n5. Eri nga ama ta mba ra\n  Kpere dra ma tia ra;\nTe ama nga dra aga ra,\n  Fizu eri be 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(77) Blessed be the name")){
                    String title = "Ongo(77) Blessed be the name";
                    String subtext = "1. Emi inzi ru Yesuni,\n  'Ba ama Papiri;\nDra pati alaza ruaa\n  Ama opazu dria\n\n    Yesu pa ma ra,\n    Yesu pa ma ra;\n    Yesu pa ma ra arisi\n(x2)\n\n2. 'Ba yi aba andra saaru;\n  Te Yesu emu ra,\nZi geri patani 'ba dri,\n  Le 'ba ofi 'bua.\n\n3. Ama eco ama pazu\n  Lu Yesu ma rusi;\n'Ba pani yi aluni ku\n  Ru azinirisi.\n\n4. 'Da runi Osutaru'i,\n  Mungu okpo beri,\nOpi asi anzuniri,\n  Ata 'daniri'i.\n\n5. Ama inzi ru Yesuni\n  'ba ama Papiri;\nAma onzi dria aga\n  Ru erinirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(78) Man of sorrows")){
                    String title = "Ongo(78) Man of sorrows";
                    String subtext = "1. Yesu 'ba ma Papiri\nDra ndra pati ruaa ra;\nWu ezata amani.\n\n    Haleluya,'Ba Papiri!\n\n2. Ale erini aga;\nEri dra ma paria,\nEri ari ra masi.\n\n3. Ma ga tre ezatasi;\nEri dra ndri lizale,\nOfe aroti mani.\n\n4. Ama ovu truzaru\nDrata erinirisi;\nMari mani de i ra.\n\n5. Yesu Kristoka emvi,\nAmaka nga eri ndre,\nAma nga ongo 'di ngo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(79) Glory to his name")){
                    String title = "Ongo(79) Glory to his name";
                    String subtext = "1.Yesu dra pati alazaa dria\nMari amani ofezu ra;\nYesuni 'Ba ama Papiri.\nMa runi inzi.\n\n    Ru inzuzaru, (2)\n    Yesu ari 'ba asi oji;\n    Ru inzuzaru.\n\n2. Yesu pa ma onzi alia,\nEri efi ma asia ra;\nMa ovu ani ayikosi.\n\n3. Pati alaza ma etia\nYesu oji ama alaru,\nEri arini ralerisi.\n\n4. Mi emu pati alaza vu,\nMi avu va Yesu ma palaa;\nYesuni nga mi dri idri fe.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(80) Tune:Prayer is the key of heaven")){
                    String title = "Ongo(80) Tune:Prayer is the key of heaven";
                    String subtext = "1. Ma inzi ru Yesuni, (3)\n  Eri pa ma ra.\n\n2. Yesu emu nyakua, (3)\n  Ma eri inzi.\n\n3. Yesu dra pati ruaa, (3)\n  Ma eri inzi.\n\n4. Yesu tu uru 'bua, (3)\n  Ma eri inzi.\n\n5. Yesuni nga emvi ra, (3)\n  Ma eri inzi.\n\n6. Ma inzi ru Yesuni, (3)\n  Eri pa ma ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(81) Tune:Mary and Martha")){
                    String title = "Ongo(81) Tune:Mary and Martha";
                    String subtext = "1. Yesu Kristo Mvi Munguniri; (3)\nYesuni ma pa ra.\n  Yesu,asi ndrizaruri,'yeta anzutiri,\n  Ayiko mani 'di,ayiko mani 'di,\nAyiko mani 'di,Yesuni ma pa ra.\n\n2. Ayiko ga tre ma asia; (3)\n\n3. Yesu Kristo dra pati ruaa; (3)\n\n4. Yesu Kristo enga dra alia; (3)\n\n5. Yesuni ma dri ce geria; (3)\n\n6. Ma asi ga tre ayikosi; (3)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(82) Lord of glory")){
                    String title = "Ongo(82) Lord of glory";
                    String subtext = "1. Opi la,ama mi inzi,\nYesu Kristo Mungu\n    Mvi;\nAma di kumuti osi\nRu miniri inzizu;\n  Mi a'dule,mi eco\nAzi ngazu onyiru.\n\n2. Opi la,ama mi inzi;\nMungu fe mi alesi\nE'yo onzi 'duzu dria,\nAma 'bazu alaru;\n  Mi a'dule,mi eco\nAma pazu onzia.\n\n3. Opi la,ama mi inzi,\n'Bani ndra gale siri;\nTe ndra mi aga dra dria,\nMi di kari nya 'bua;\n  Mi a'dule,mi eco\n  Ama pazu dra alia.\n\n4. Opi la,ama mi inzi\nMini engalerisi;\nYesu,mi ka nga emvi ra.\nMi nga,wudrikuru nya;\n  Mi a'dule,mi eco\n  Opi nyazu 'yeke ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(83) What a wonderful Saviour")){
                    String title = "Ongo(83) What a wonderful Saviour";
                    String subtext = "1. Yesu ede e'yo onzi,\n  'Ba 'ba Papiri Yesu;\nOfe arioti 'banini,\n  'Ba 'ba Papiri Yesu.\n  'Ba 'ba Papiri Yesu,\n    Mungu ma\n      Mvaruri;\n    'Ba 'ba Papiri Yesu,\n  Opi amani.\n\n2. Yesu 'ba tru Satani dri,\n  'Ba 'ba Papiri Yesu;\n Yesu 'ba dri ce alesi,\n  'Ba 'ba Papiri Yesu.\n\nYesu 'ba Papiri dri ce alesi,\n  'Ba 'ba Papiri Yesu.\n\n3. Mungu ma asi ambi ra,\n  'Ba 'ba Papiri Yesu;\nEri oji ama asi,\n  'Ba 'ba Papiri Yesu\n\n4. Eri idri fe ama dri,\n  'Ba 'ba Papiri Yesu;\nAma ovu ayikosi,\n  'Ba 'ba Papiri Yesu.\n\n5. Ama inzi Yesu ma ru,\n  'Ba 'ba Papiri Yesu;\nEri asi ndriza feni,\n  'Ba 'ba Papiri Yesu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(84) Zaburi 40.1-3")){
                    String title = "Ongo(84) Zaburi 40.1-3";
                    String subtext = "1. Orita fe ma pa nzozu,\n  Ma e'de' bile alia;\nYesu Kristo eri ma ra\n  Mani eri ziria.\n\n  Enze ma orita alia,\n  'Ba ma pa kata dria;\n  Ma le ru Yesuni\n    inzi\n  Yesu dri awa'difo!\n\n2. Yesu enze ma letasi,\n  De ma ovu 'bilea,\nOrita alia pa ma;\n  Wu ezata maniri.\n\n3. Yesu 'ba ma kata dria,\n  Ko ma aza pa sozu;\nEri fe ma pa ma nzo ku,\n  Ma aci ani drile.\n\n4. Yesu 'ba ongo o'diru\n  Curu'do ma tilea;\nMa inzi ru Yesuniri,\n  Eri 'ba ma Papiri.\n\n5. Yesu,mi ce ma dri drile\n  E'yo 'yezu onyiru;\n'Ba ma ndre acita mani,\n  Ma bi mi vuti ani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(85) Blessed assurance")){
                    String title = "Ongo(85) Blessed assurance";
                    String subtext = "1. Asi 'baza maniri 'di'i,\n  Yesuni 'Ba ma Papiri'i;\nEri nga ma ta mba etuzu,\n  Kpere mani caria 'bua.\n\n  Ongo maniri eri 'di'i,\n  Ma Yesu ma Papiri inzi.\n(x2)\n\n2. Ayiko maniri eri 'di.\n  Yesu je ma ari inisi;\nFe ma dri idri o'diruri\n  Orindi Alatararusi.\n\n3. Drileba maniri eri 'di:\n  Yesuni nga ma dri ce 'dani\nGeri iniri ma alia,\n  Ma kazu muzu ezazu ku.\n\n4. Asi anzuru maniri 'di:\n  Yesuni 'ba ma Papiri'i;\nAle erini ma lezuri\n  Ga ma asia tre etuzu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(86) Hallelujah,sing to Jesus")){
                    String title = "Ongo(86) Hallelujah,sing to Jesus";
                    String subtext = "1. Haleluya,mi ngo Yesu dri,\n  Eri Opi amani;\nHaleluya,Yesu aga dra,\n  Yesunde Satani ra.\n'Ba Yesuni pale 'diyi\n  Yi ongo ngo Yesu dri,\nSuru dria ma eselia:\n  Yesu je ama arisi.\n\n2. Haleluya! Yesu kuni\n  Ama imvoanziru ku;\nHaleluya! Eri dri\n  Ama agei te 'dani.\nDe nga Yesu tuni ndra ku\n  Eri 'yo e'yo 'diri:\nMa emi be 'dani 'dani,\n  Ma ngani emi ku ku.\n\n3. Haleluya! 'Ba 'ba Papiri,\n  Mi pa ama onzia;\nHaleluya! 'Ba onzi 'diyi\n  Apa mi vu etuzu.\nMi nga ma 'du uru 'bua,\n  Mi 'ba onzi ma agyi;\nMa nga ani mi ru inzu\n  Mini ma palerisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(87) Praise the Saviour,ye who know him")){
                    String title = "Ongo(87) Praise the Saviour,ye who know him";
                    String subtext = "1. Ama inzi ru Yesuni,\n  Eri 'Ba ama Papiri;\nAma fe asi amani\n  Eri dri ceni.\n\n2. Ru Yesuni ayikoru,\n  Eri Opi amaniri;\nAma ka eri a'i ra,\n  Eri okpo fe.\n\n3. Ama 'ba Kristoni 'diyi\n  Ama asi 'ba Yesu\n   dria;\nEri nga ama agei te\n  O'du vusi zu.\n\n4. Yesu,mi mba ama ta\n    fo;\n  Ama nga pa so ci ani,\nKpere amani caria\n  Mi vu 'bua 'daa.\n\n5. Ama ka ca 'bua 'dale,\n  Ama nga ovu alaru;\nAma nga mi inzi 'dani\n    Asikokoru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(88) Precious Saviour,I will praise thee")){
                    String title = "Ongo(88) Precious Saviour,I will praise thee";
                    String subtext = "1. Yesu 'ba ma Papiri la,\n  Ma miniru a'dule;\nMi ari eco 'ba oji,\n  Yesu Kabilomvani.\n\n  Ama mi inzi tu,\n      Yesu,\n    Kabilomva Munguni\n    Mi ari ra 'ba\n      Ojizu,\n    Awafo' Ba Papiri.\n\n2. Andra ma o'bi okposi,\n  Te ti,ma econi ku;\nTe ma emu andru mi vu\n  Asi ndriza isuzu.\n\n3. Ma nga e'yo bari olu,\n  Pata Yesuniri'i;\nMa ngani ece e'yoni\n  Oluzu etuzu ku.\n\n4. Ma e'yo Yesuni e'da\n  Uri kokoru 'ba tia,\nErini ma trulerisi;\n  Yesu pa ma adaru.\n\n5. Haleluya! Inzitari,\n  Diza Yesu vu ambo.\n\n6. Awafo 'Ba ma Papiri,\n  'Ba asi ndriza beri;\nMi ayiko fe ma dri tu.\n  Yesu la,ma mi inzi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(89) Glory to Jesus")){
                    String title = "Ongo(89) Glory to Jesus";
                    String subtext = "1. Yesu le ma ra,'Ba 'ba Papiri,\nYesu le ma ra,ma nini e'yoni 'de ku;\nEmu 'ba onzi opazu dria,\nLeni aluni ma ja dri 'de ku.\n\n  Ma inzi Yesu,'Ba 'ba Papiri,\n  Ru inzizaru,Yesu mani lele turi;\n Ru inzizaru,'Ba 'ba Papari,\n  Run inzizaru,ru Yesuniri.\n\n2. Yesu le ma ra,'Ba 'ba Papiri,\nYesu le ma ra,ma nini ngoni yari ku;\nMa ni alu ra,eri dra masi,\nMa aroti ofezu arisi.\n\n3. Eri ma dri ce,'Ba 'ba Papiri,\nEri ma dri ce,ma nini ngole yari ku;\nCandi ka indi,kani ayiko,\nMa nga Yesu ma vuti bi 'dani\n\n4. Eri nga ma 'du Mungu vu 'bua,\nEri nga ma 'du,ma nini o'duni 'de ku;\nAku 'buari ma nga ndre indi,\nMa nga ri va malaika be 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(90) How sweet the name of Jesus sounds")){
                    String title = "Ongo(90) How sweet the name of Jesus sounds";
                    String subtext = "1. Ru Yesuni aluzaru\n  'Ba a'ipiri dri;\nEri asi anzuru fe\n  Candi atizu dria.\n\n2. Asi ka oti urisi,\n  Ru 'diri uri dro;\nRu 'diri ava lizani,\n  Nyaka 'buariru.\n\n3. Ru 'diri onyi ejini,\n  E'yo onyiru be;\nEri ma dri gomberele\n  Ma agei tezu.\n\n4. Yesu,mi 'Ba ma Papiri,\n  Mi ovu ma agyi,Mi idri maniri indi;\n  Ma le mi ru inzi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(91) At the name of Jesus")){
                    String title = "Ongo(91) At the name of Jesus";
                    String subtext = "1. 'Ba dria ma osi\n  Yi kumuti va\nDiza fe Yesu dri,\n  Runi inzizu;\n'Ba dria ma e'da\n  Yi ma tisi fo,\nKini Yesu Kristo\n  Eri Opi'i.\n\n2. Okokele eri\n  Ovu Mungu be,\nInzitani ovu\n  Atanirile;\nTe Yesu 'ba i ma\n  Ngulupi ele,\nI ojazu 'baru\n  Ama opazu.\n\n3. Mi ma a'i Yesu\n  Mi ma asia,\nOvuzu Opiru\n Mi ma drilia;\nSatani ka le mi\n  Obezu saaru,\nMi nga eri aga\n  Yesu ma rusi.\n\n4. Opi Yesu nga\n  Emvi nyakua\nDiza Atani be,\n  'Ba e'yo lizu.\nMi ede mi ngonde\n  Eri ndrezu fo!\nEri opi nya ra\n  Asikokoru\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(92) It passeth knowledge")){
                    String title = "Ongo(92) It passeth knowledge";
                    String subtext = "1. Yesu,ale mini 'ba lezuri\nEri e'yo vaza 'baniri nde;\nTe ti,ma asi le oconi ni\nWalani pie,inzuni pie,\n  Okponi be.\n\n2. Yesu,ale mini 'ba lezuri\nAga okpo olupiniri ra;\nTe ti ma le e'yoni oluzu\n'Ba onzi dria vu,yini ani\n  Yi pazu ra.\n\n3. Yesu,ale mini 'ba lezuri\nAga inzuta 'bani dri ra;\nTe ti,ma le e'yoni ongozu,\nEri 'ba onzi tu maleri ji\n  Mi vu inyia.\n\n4. Ale mini ma ga tre ma asia,\nMani ani 'ba lezu avasi\nEkile mini yi lelerile,\nMani ani e'yo dria 'yezu\n  Alesi fo.\n\n5. Ma nga ca 'bua mi mile ndrezu,\nAvuzu va,inzizu mi palaa;\nMa nga ale mini ma lezuri\nMa e'yo ngo avasi,'ba dria\n  'Bua 'diyi be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(93) All hail the power of Jesus' name")){
                    String title = "Ongo(93) All hail the power of Jesus' name";
                    String subtext = "1. Mi inzi Opi Yesu ma ru\nMalaika pie,Yesu ma drilia!\nMi ofu ekilaza opini,\nAma ma su Yesu ma dria 'ba dria drilia;\nYesu Kristo ovu adaru Opini!\n\n2. 'Ba Munguni opale dria,\nPale Satani dria,aje ambosi 'diyi,\nEmi inzi Yesu 'ba Papiri;\nAma ma 'ba Yesu opiru 'ba dria drilia;\nYesu Kristo ovu adaru Opini!\n\n3. 'Ba nyakua dria ma inzi\nYesu opi 'bua,Mungu Okpo Turi;\nAma 'ba suruti dria 'diyi,\nAma ma 'ba Yesu opiru 'ba dria drilia;\nYesu Kristo ovu adaru Opini!\n\n4. Onyiru ama ma eco va\n'Ba 'bua 'diyi be,Yesu Kristo palaa;\n'Ba yi ojipi arisi 'diyi,\nAma ma 'ba Yesu opiru 'ba dria drilia;\nYesu Kristo ovu adaru Opini!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(94) Our blessed Redeemer")){
                    String title = "Ongo(94) Our blessed Redeemer";
                    String subtext = "1. Yesu tuzu 'boria,\n  Pe Orindi ini\nAlatararuri ma ti\n  'Ba ini vu.\n\n2. Emu di a'balaule\n  Asi anzuru be,\nFezu ombani i dezu\n  Adra pie.\n\n3. Emu andra be acile,\n  'Ba asi imbazu;\nFe okpo e'yo baruri\n  Oluzu ra.\n\n4. Emu asi ndriza eji\n  'Ba ma eselia;\nEfi 'ba afu kokoru\n  Ma asia.\n\n5. Agaza onzi ndezuri\n  Asi alaru be,\nYi enga lu Orindi vu,\n  Onyi pie.\n\n6. Orindi Alatararu,\n  Mi emu ama vu,\nOpi nyazu ama asia\n  Etuzu zu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(95) Come,Holy Ghost,our souls inspire")){
                    String title = "Ongo(95) Come,Holy Ghost,our souls inspire";
                    String subtext = "1. Orindi Alatararu,\nMi esi ama vu inyia;\nMi fe ama asi ma ve\nAle mini felerisi.\n\n2. Orindi asi ndrizani,\nMi osu odu ama dria\nAsi amani omizu,\nOkpo fezu ale be zu.\n\n3. Ama 'ba mile kokoru,\nMi fe ama dri diza fo;\nMi ede ama alaru\nAsi ndriza minirisi.\n\n4. Mi fe asi anzuru fo,\nMi dro ari'ba dria re;\nMini ama dri ceria,\nAma nga drileba is.\n\n5. Mi imba ama mi nizu,\nAta,Mvi pie,tualu;\nAma Mungu alu inzi\n'Dani 'dani dekokoru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(96) Come,gracious Spirit")){
                    String title = "Ongo(96) Come,gracious Spirit";
                    String subtext = "1. Orindi asi ndriza be,\nMi eji diza ama vu;\nMi ce ama dri onyiru\nE'yo dria ma alia.\n\n2. Mi ece e'yo adani,\nAma ma pe geri mini;\nMi ka ama se Yesu vu,\nAma ngani mbu amve\n    ku\n\n3. Mi fe ama ma ru\n    Mungu,\nAma ma adri alaru;\nMi ce ama dri kilili,\nAma kazu abazu ku.\n\n4. Mi ce ama dri Mungu\n    vu,\nAva lizu uru 'bua;\nMi ce ama dri 'dale fo,\nOvuzu drilebaru zu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(97) Spirit Divine")){
                    String title = "Ongo(97) Spirit Divine";
                    String subtext = "1. Orindi Munguniri la,\n  Mi ko ama aza;\nMi esi va okpo be tu,\n  Rizu ama dria.\n\n2. Mi emu kile dizale,\n  Ecezu ama dri\nAsi onzi amaniri,\n  Diza Yesunisi.\n\n3. Mi emu kile acile;\n  Mi fe ama ma ve\nAva o'diru mi lezu\n  O'du driasi.\n\n4. Mi emu kile ozoole,\n  'Dizu ama dria;\nEfi mini ma ka ani\n  Ama ma alia.\n\n5. Mi emu a'balaule\n  Asi anzuru be,\n'Ba Yesuni ma le yi tu\n  Yi ma eselia.\n\n6. Orindi Munguniri la,\n  Mi ko ama aza;\nMi esi va okpo be tu,\n  Rizu ama dria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(98) O Holy Spirit,whom our Master sent")){
                    String title = "Ongo(98) O Holy Spirit,whom our Master sent";
                    String subtext = "1. Orindi Alatararu la,\nAfa onyiru yi enga mi vu;\nMi fe ale miniri ama dri,\n'Diri afa feza onyiruri.\n\n2. Gombere amani a'itani,\nAjuniri e'yo Yesuniri,\nAgatia ama su onyi'i,\nAsi anzuru ama su paa'i.\n\n3. Ama le afa feza miniri;\nAfa agapi onyisi rari\n'Di ale amani ama lezu,\nLeta Yesuni 'ba lezurile.\n\n4. Letani asi teza ejini,\nAsi anzuru a'ya kokoru;\n'Yeni e'yo i ngulupisi ku,\nAfuni yo,andeni ku indi.\n\n5. Mi fe ama dri ale Yesuni;\nAma ka nga ama ndre eri be\nAma nga ovu trotro erile,\nAma lezu ama eselia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(99) O Spirit of the living God")){
                    String title = "Ongo(99) O Spirit of the living God";
                    String subtext = "1. Orindi idri fepiri,\nOrindi Munguniri'i;\nMi esi ale mini be,\nMi ko 'ba ma aza dria.\n\n2. Mi 'ba mi ava ama dria,\nMi fe ama asi ma ve\nE'yo Yesuni oluzu,\nOkpo minisi 'ba pazu.\n\n3. Mi oja ini eturu,\nMi 'ba 'ba onzi kilili,\nMi fe 'ba andepi 'diyi\nMa enga okpo be dika.\n\n4. Orindi,mi ede 'ba dria\nDri fuzu Mungu be 'bua;\nMi vu ava mini 'ba vu\nYini osizu o'diru.\n\n5. Mi ere e'yo Yesuni,\nMi omve 'ba suru dri dria,\nMi ese 'ba mi be re 'diyi,\nYi ma inzi Yesu ani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(100) Fill me now")){
                    String title = "Ongo(100) Fill me now";
                    String subtext = "1. Orindi Alatararu,\n  Mi efi ma asia;\nMi fe ma asi ma ga tre\n  Ava minirisi fo.\n\n    Mi emu,mi emu,\n    Mi ga ma asia tre;\n    Eco mini efizaru\n    Ma asia curu'do.\n\n2. Ma ovu okpo kokoru,\n  Ma emu mi milia;\nOrindi Alatararu,\n  Mi fe okpo ma dri fo.\n\n3. Mi 'ba ma asi alaru,\n  Ma le aci Yesule;\nMi omi ma asi 'dani,\n  Mi emu,Orindi la!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(101) Breathe on me,Breath of God")){
                    String title = "Ongo(101) Breathe on me,Breath of God";
                    String subtext = "1. Orindi Yesuni,\n  Mi ga ma asia;\nMa nga ani e'yo le ra\n  Mini lelerile.\n\n2. Orindi Yesuni,\n  Mi 'ba ma alaru;\nMa nga ani e'yo 'ye ra\n  Mini lelerile.\n\n3. Orindi Yesuni,\n  Mi 'ba ma Yesule;\nMa nga azi erini nga\n  Eri ma alesi.\n4. Orindi Yesuni,\n  Mi fe okpo ma dri;\nMa nga e'yo  bari olu\n  Okpo minirisi.\n\n5. Orindi Yesuni,\n  Mi fe idri ma dri;\nMa nga ovu mi be 'dani\n  Yesuni inzizu.\n\n6. Orindi Yesuni,\n  Ma ru mini inzi;\nMi Yesu be 'dani 'dani\n  Ata be tualu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(102) Breathe on me,Breath on God")){
                    String title = "Ongo(102) Breathe on me,Breath on God";
                    String subtext = "1. Orindi Munguni,\n  Mi vu ava ma dria;\nMa nga ani e'yo mini\n  Leleri le indi.\n\n2. Mi vu ava ma dria,\n  Ma 'bazu alaru;\nMani ani e'yo onzi\n  Kuzu 'yekokoru.\n\n3. Mi vu ava ma dria,\n  Ma 'bazu o'diru;\nMani Yesu vuti bizu\n  Ma asi driasi.\n\n4. Orindi Munguni,\n  Mi vu ava ma dria;\nMani ngazu tuzu 'bua\n  Ovuzu mi be 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(103)")){
                    String title = "Ongo(103)";
                    String subtext = "1. Eyo Munguni Buku alia\n  Ngani asi ewu vusi ku;\nEri ayiko fe ama dri,\n  Amani e'yoni laria.\n\n    Idri ma e'i eri Yesu,\n    Mi ma la e'yo erini fo!\n    Mi ma nda adro azini ku;\n    'Ba 'ba Papiri eri Yesu.\n\n2. 'Ba ma e'yoni nga i de ra,\n  'Ba nyakua yi nga odra dria;\n'Ba 'ba Papiri eri Yesu,\n  Eri ma e'yo asini ku.\n\n3. Mungu azi azita 'diri:\n  Geri 'buari eri Yesu;\nMi ma bi Yesu ma vuti fo,\n  Geri andini eri 'de yo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(104) Standing on the promises")){
                    String title = "Ongo(104) Standing on the promises";
                    String subtext = "1. Mi so pa E'yo Siza Mungunisi,\nAma dria ma inzi ru erini;\nE'yo aziza erini adaru,\nMi so pa e'yo Mungunisi.\n\n    Mi ma so pa\n    Okpo be aziza Munguni 'diyisi;\n    Ada andru\n    Mi so pa e'yo Mungunirisi.\n\n2. Mi so pa aziza Mungunirisi,\n'Di e'yo amboru Bukuari'i;\nE'yo Munguni yi dria alaru,\nMi so pa e'yo Mungunisi.\n\n3. Mi so pa aziza Yesunirisi,\nEri ma oji e'yo onzisi;\nEri ari ra ndra ama ojizu,\nMi so pa e'yo Yesunisi\n\n4. Mi so pa aziza Yesunirisi,\nAsi mini 'bazu drinia 'dani;\nMi nga e'yo onzi aga erisi,\nMi so pa e'yo Yesunisi.\n\n5. Mi so pa E'yo Siza Mungunisi,\nGeri 'dirisi mi ngani 'de va ku;\nMunguni nga mi dri ce etuzuni,\nMi so pa e'yo Mungunisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(105) Cling to the Bible")){
                    String title = "Ongo(105) Cling to the Bible";
                    String subtext = "1. Buku engapi Mungu vuri mi bi,\n  Mi bi e'yoni okposi andru;\nMi mba azita ma ta ayikosi,\n  Mi aci Bukuni 'yolerile.\n\n    Mi ma la Buku,mi nda e'yoni;\n    Mi ma inzi imbatani dria.\n\n2. Bukua mi nda e'yo idriniri,\n  Mi nda ondua aleniari;\nMi olu e'yoni 'ba dria tia,\n  'Ba o'du kopi 'diyi oruzu.\n\n3. E'yo isule Buku aliari\n  Eri idri fe 'ba drapiri dri;\nEri nga 'ba dri ce cazu 'bua ra,\n  Nga vini yi dri okpo fe indi.\n\n4. 'Ba ka 'ye geri ku,acizu saaru,\n  Buku Munguni eri talale;\nEri'ba 'wara ma dri ce anzi be,\n  Mi ma la Buku asi driasi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(106) Break thou the Bread of life")){
                    String title = "Ongo(106) Break thou the Bread of life";
                    String subtext = "1. Mi fe nyaka ma dri\n  Opi Yesu;\nNyaka idriniri\n  Ma le nya'i.\nEnya nyakuniri\n  Econi ku;\nLu mi a'dule fe\n  Ma trazuni.\n\n2. Mi nyaka idrin\n  Ma dri,Yesu;\nE'yo mini eji\n  Pata ma vu.\nMi fe ma ni e'yo\n  Mini lezu,\nMa ma aci ani\n  Mi be 'dani.\n\n3. Mi epe Orindi\n  Mini ma ti\nMile mani zizu\n  Mi ndrezu fo!\nMani mi ndreria\n  A'itasi,\nMa nga mi vuti bi\n  'Dani 'dani.\n\n4. Mi fe ma dri nyaka\n  Orindini;\nMa ma ovu ani\n  Okpo be zu.\nDriwala adaru\n  Ma nga isu,\nAsi ndriza pie,\n  Mi alia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(107) Holy Bible,book divine")){
                    String title = "Ongo(107) Holy Bible,book divine";
                    String subtext = "1. Buku alatararu,\nBuku arikariru;\nMa isu mi alia\nGeri muzu Yesu vu.\n\n2. Buku 'diri alia\nMa nga onzi manini;\nMa isu pata indi,\nOnzi kuzu Yesusi.\n\n3. Buku 'diri alia\nMa nga imbata isu;\nMa ka ovu candisi,\nEri ma asi omi.\n\n4. Buku 'diri alia\nMa la e'yo Yesuni;\nEri ma aza ko tu\nGeri idrini nizu\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(108)")){
                    String title = "Ongo(108)";
                    String subtext = "1. Orindi Alatararu\n  Ce ndra nabi ma dri\nE'yo Munguni sizu ci\n  Buku ma alia.\n\n2. E'yo yini sile 'diyi\n  Yi dria adaru,\nOrindi adanirini\n  Yi dri celerisi.\n\n3. Yi si e'yo nde amasi\n  Ama imbazu ra,\nAmani ale Munguni\n  'Ba lezuri nizu.\n\n4. Ama ondua isu ra\n  E'yo Siza alia,\nAmani ama onazu\n  E'yo onzirisi.\n\n5. Orindi Munguniri la,\n  Mi emu ama vu\n Ama ma asi imbazu\n  E'yoni vazu fo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(109) Lord,thy Word abideth")){
                    String title = "Ongo(109) Lord,thy Word abideth";
                    String subtext = "1. E'yo Munguniri\nAma dri ce 'danini;\n'Ba eri a'ipiri\nAyiko isu ra.\n\n2. Opi,mi e'yoni\nAma ma aza koni,\nAma asi omizu\nPata ma e'yosi.\n\n3. Inzata ka eca\nAma vu drata pie,\nAma yi aga dria,\nOpi,mi e'yosi.\n\n4. 'Ba ka e'yo mini\nLa si adarusi,\nA'di ni ayikoni\n'Bani isuleri?\n\n5. E'yo nde yiki fe\n'Ba onziru 'diyi dri,\nYini asi ojazu,\nYi dri idri fezu.\n\n6. Le ama ma oni\nE'yo Siza ma efi;\nAma nga mi le ani,\nOpi,'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(110) More about Jesus")){
                    String title = "Ongo(110) More about Jesus";
                    String subtext = "1.E'yo Yesuni ma le ni,\nErini ama lezuri;\nMa le eri ma ru inzi\nAsi ndriza erinisi.\n\n    Ma le e'yo oni, (2)\n    E'yo Yesuni ma lezu,\n    Erini drazunmasiri.\n\n2. E'yo azini ma le ndre,\nYesuni ecezuri'i;\nMa le e'yo Yesuni 'ye,\nAyiko fezu eridri.\n\n3. Ma le e'yo Yesuni la\nE'yo Siza ma alia;\nMa le Yesu ma vuti bi,\nTi ecizu eri be zu.\n\n4. Ma le e'yo azini ni,\nDiza Yesuni ecezu;\nYesuni kari nya 'bua\nAta ma dri adaria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(111) 'Tis so sweet")){
                    String title = "Ongo(111) 'Tis so sweet";
                    String subtext = "1.Yesu,ma le mi a'i ra,\nE'yo mini 'yoleri;\nMi nga 'ye ecekokoru\nMini 'yole 'borile\n\n    Yesu,e'yo mini ngani\n    Inzo li aluni ku;\n    Mi nga 'ye ra kile e'yo\n    Mini azilerile.\n\n2. Ma ka ovu a'ita be,\nUri bini ma 'de ku;\nMi wu onzi mani dria\nAsi ndriza minisi.\n\n3.Yesu,mi fe ma ma a'i\nIdri mini etuzu;\nMa ma a'i etu vusi\nAsi anzuru mini.\n\n4. E,ma ovu ayikosi\nMani mi nilerisi;\nMa aci uri kokoru,\nMi ovu ma be 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(112) Tune:Swing low sweet chariot")){
                    String title = "Ongo(112) Tune:Swing low sweet chariot";
                    String subtext = "1. Mungu le 'ba dria,\n  Fe mvi ini yi opazu;\nMungu le 'ba dria,\n  Fe Mvi ini aluri'i.\n\n2. Mungu pe Mvi ma ti\n  'Ba a'ipi 'Diyi opa;\nEri emu nyakua\n 'Ba a'ipi 'diyi opa.\n\n3. Yi ngani dri ja ku,\n  'Ba Yesuni a'ipi 'diyi;\nYi ovu idri be,\n  'Ba Yesuni a'ipi 'diyi.\n\n4. Yesu emu nyakua\n Idri 'dani 'dani fezu;\nYesu emu nyakua\n  'Ba a'ipi 'diyi opa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(113) The love of God is greater far")){
                    String title = "Ongo(113) The love of God is greater far";
                    String subtext = "1. Ale Munguni aga 'bani\nEcole egaleri ra;\nEri 'bu ururi aga ra,\nCa kpere va 'bilea ra;\n'Ba e'yo onzi 'yepi 'diyi,\nEri yi le avasi;\nEfe i Mvini yi opazu\nE'yo onzi yinisi.\n\n    Ale Munguni ndri tu 'doni!\n    Osutaru,amboru!\n    Eri ngani i de ku 'dani;\n    'Ba ma inzi ongosi.\n\n2. Ewu 'dori ka nga asi ra,\nOpi nyaza ka yi de dria,\n'Ba Mungu e'yo gapi si 'diyi\nNga le oni ma gu yi dria.\nAle Munguni ambo nderi\nNga adri 'dani 'dani,\nAma onzezu asi ndriza\nIni ambo turisi\n\n3. Yi mirini ka dria vinyo,\n'Bu uru ka waraga bi,\nAse bi dria ka kalamu,\n'Ba dria ka e'yo osi,\nMungu uru turi ma ale\nSizu nga miri de dria,\n'Bu waragaru nderi cani\nAle nde sizu de ku!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(114)")){
                    String title = "Ongo(114)";
                    String subtext = "1. Ama mu kabilole onzi alia,\nMuzu geri amani peleria;\nAri Yesuni ra onzi amanisi,\nDra ezata amanirisi.\n\n    Mungu fe ndra Mvi ini,\n    Erini ama lelerisi;\n    'Ba Yesu a'ipiri ngani dri ja ku,\nEri idri 'dani 'dani be.\n\n2. 'Ba Yesu a'ipiri eri idri be,\nTe 'ba eri gapiri nga dri ja;\nTe 'ba nde ngani idri ndre aluni ku,\nAdra Munguni ruania.\n\n3. Yesu kini,Ma ni kabilo mani ra,\nMa fe idri 'dani 'dani yi dri;\nMa nga yi ma dri oce 'dani 'dani ra,\nYingani dri ja aluniku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(115) Nothing but the blood of Jesus")){
                    String title = "Ongo(115) Nothing but the blood of Jesus";
                    String subtext = "1. A'dini ma ojini?\nAri Yesuni a'dule.\nA'dini ma atini?\nAri Yesuni a'dule.\n\n    E,ari okporu\n    'Ba asi ojizuri;\n    Ari andini yo,\nAri Yesuni a'dule\n\n2. Ma 'bapi alaruri\nAri Yesuni a'dule.\nMa mari ofezuri\nAri Yesuni a'dule.\n\n3. A'di ede onzini?\nAri Yesuni a'dule.\nA'dini nga ma pani?\nAri Yesuni a'dule.\n\n4. Asi anzu maniri\nAri Yesuni a'dule.\nAsi 'baza maniri\nAri Yesuni a'dule.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(116) Have yo been to Jesus?")){
                    String title = "Ongo(116) Have yo been to Jesus?";
                    String subtext = "1. Mi emu Yesu vu mi asi;\n Mi oji mi arisi ra ya?\nAri Yesuniri fudri 'ba pazu,\n  Oji ari Yesunisi\n\n    Ojizu...Arisi...\n    Ojizu ari Yesunisi;\n    Mi asi ovu emveru ivile,\n    Ojizu ari Yesunisi.\n\n2. Mi bi Yesu vuti mi asi driasi;\n  Mi oji mi arisi ra ya?\nMi ati mi Yesu Kristo agatia,\n  Ojizu ari Yesunisi.\n\n3. Ace were Yesuni nga emvi ra;\n  Mi oji mi arisi ra ya?\nEri nga mi isu onyiru ada,\n  Ojizu ari Yesunisi?\n\n4. Mi 'be afa mi dri icipiri re,\n  Mi oji mi arisi ra ya?\nYi a'di ra 'ba ondi be 'diyisi,\n  Ojizu ari Yesunisi.\n\n ";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(117)")){
                    String title = "Ongo(117)";
                    String subtext = "1. Mi ndre 'dari,eri'i\nKabilomva Munguni;\nMi ndre 'dari,eri'i\nKabilomva Munguni.\n\n    Ezata 'bani 'diyi\n    Yesu wu yi dria ra\n    (x2)\n\n2. Mi ma emu Yesu vu,\nEri nga mi pa ada;\nMi emu Yesu vu fo!\nEri nga mi pa ada.\n\n    Yesu ma arisi\n    Mi oji mi alaru\n    (x2)\n\n3. Mi fe mi ma nugulupi\nOpi Yesu Kristo dri;\nMi fe mi ma ngulupi\nOpi Yesu Kristo dri.\n\n    Eri nga ayiko\n    Fe mi dri mi asia.\n    (x2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(118) Whosoever will")){
                    String title = "Ongo(118) Whosoever will";
                    String subtext = "1. Mi ka le emu,mi emu Yesu vu;\nEri le mi tu,nga mi a'i ada.\nYesuni nga onzi miniri oji,\n  eri nga idri fe ra.\n\n    Mi ka le emu,mi ku onzi ja,\n    Mi emu Yesu vu mi onzi e'da;\n    Yesuni nga onzi mini wu dria,\nNga asi alaru fe.\n\n2. Mi emu Yesu vu,eri okpo be,\nEri nde Satani ma obeta dria;\nEri nga Orindi Alatararu\n  Fe mi drionzi ndezu.\n\n3. Mi emu Yesu vu uri kokoru;\nEri geri 'bani tuzu 'buari,\nEri nga mi ji Mungu ma milia,\n  Eri 'Ba 'ba Papiri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(119)")){
                    String title = "Ongo(119)";
                    String subtext = "1. Panga e'yo onziniri dra,\n  Yesu emu marini ofe;\nMi ka le Mungu ma pa mi ra,\n  Mi a'i Opi Yesuni fo.\n\n    Mi a'i,mi a'i,\n    Mi a'i Yesu Kristo andru;\n    Mi a'i,mi a'i,\n    Mi a'i Yesu Kristo ndi ndi.\n\n2. Ari Yesuni ra ndra misi,\n  Ra aroti mini ofezu;\nMi ka le e'yo onzi kuzu,\n  Mi a'i Opi Yesuni fo.\n\n3. Yesu Kristo enga dra alia,\n  Eri tu opi nyazu 'bua;\nMi ka idri 'dani 'dani le,\n  Mi a'i Opi Yesuni fo.\n\n4. Yesuni nga emvi nyakua\n  'Ba dria ma e'yo lizu ra;\nMi ka le e'yo ma nde mi ku,\n  Mi a'i Opi Yesuni fo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(120) There is life for a look")){
                    String title = "Ongo(120) There is life for a look";
                    String subtext = "1. Andra uri ogo 'ba Israelini,\n  Yini e'yo Munguni garia;\nTe 'ba uri ma wura pati sia,\n  'Ba ka lu ra,yi rua ati.\n\n    Mi lu,mi a'i;\n    Mi ka lu curu'do\n    Kristo drapi misiri,\n    Mi nga idri isu eri vu.\n\n2. 'Yeta onyi be mini 'yele 'diyisi\n  Mi econi mi pazaru ku;\nMi econi onzi miniri inizu ku\n  Pe lu ari Yesunirisi.\n\n3. Mi te ku,mi ma lu 'Ba 'ba Papiri vu,\n  Mi ka le onzi mini kuzu;\nMi ka eri a'i,Yesuni nga mi paa ra,\n  Eri dra misi pati ruaa.\n\n4. Erini drale pati ma ruaarisi\n  Mi eco fi idri ma alia;\nMi eco ayiko isuzaru Yesu vu,\n  Mi ka mi asi 'ba drinia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(121)")){
                    String title = "Ongo(121)";
                    String subtext = "1. Yesu Kristo,omve 'ba ra,\n  'Ba onzi 'yepi 'diyi;\nEri le mi onzi wu ra,\n  Eri ovu ale be.\n\n    Mi emu,mi emu,\n    Mi emu andru coti.\n    Mi te te a'disia?\n    Yesu le mi avasi.\n\n2. Mi eza e'yo Munguni,\n  Mi ndra Mungu be re tu;\nAndru mi oja mi asi,\n  mi ma a'i Yesuni.\n\n3. Mi ma te ku,mi ece ku,\n  Sawa aga fudri 'bo;\nYesuni nga mi a'i ra\n  Idri o'diru fezu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(122) Only a step to Jesus")){
                    String title = "Ongo(122) Only a step to Jesus";
                    String subtext = "1. Mi ma emu Yesu vu,\n  Eri ogogo tu;\nMi ku ezata mini,\n  Mi inzi Yesuni.\n\n    Mi ma enga,mi ma emu,\n    Eri mi dri te te;\n    Mi ku ezata mini,\n    Mi mu asi ndriza ndru;\n    Yesu eri 'Ba asi\n    Ndriza Fepiri'i.\n\n2. Mi ma emu Yesu vu,\n  Angu biza kuzu;\nMi ma fi diza alia,\n  Yesuni dizani.\n\n3. Mi ma emu Yesu vu,\n  Eri ogogo tu;\nEri mi omve andru\n  Emuzu i vu fo!\n4. Mi ma emu Yesu vu,\n  Mi emu,mi ru ku;\nEri dra 'ba onzisi,\n  Mi emu eri vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(123) Come,ye sinners")){
                    String title = "Ongo(123) Come,ye sinners";
                    String subtext = "1. Mi 'ba onzi 'yepi rari,\nMi ma emu Yesu vu;\nEri dra ama opazu,\nEri asi ndriza be.\n\n  Mi ma emu, (2)\n  Eri ngonde mi pazu. (2)\n\n2. Mi eza mi teketeke\nE'yo onzi minisi;\nYesu le mi onzi wu ra\nAsi ndriza inisi.\n\n  Mi ma emu, (2)\n  Eri ngonde mi pazu. (2)\n\n3. Yesu nya ndra candi misi,\nMi pazu onzi alia;\nDra pati alaza ruaa\nE'yo onzi 'banisi.\n\n  Mi ma a'i, (2)\n  Yesu 'Ba 'ba Papiri. (2)\n\n4. Mi ka ovu andezaru\nAsi ka 'ye urisi,\nMi emu di Yesu vu fo;\nGeri andiniri yo.\n\n  Mi ma a'i (2)\n  Yesu 'Ba 'ba Papiri. (2)\n\n5. Mi econi mi 'bazaru\nAlaru mi drisi ku;\nMi emu Yesu Kristo vu\nE'yo onzi minisi.\n\n  Eri eco (2)\n  Onzi mini wuzaru. (2)\n\n6. Te onyi mini leleri,\nYesuni nga fe mi dri;\nAsi ojaza adaru\nEnga kiri Yesu vu.\n\n  Eri eco (2)\n  Onzi mini wuzaru. (2)\n\n7. Ari Yesu Kristoniri\nRa ndra onziminisi;\nAndru mima 'ba mi asi\nYesuni a'izu fo.\n\n  Mi ma emu (2)\n  Opi Yesu vu coti. (2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(124) Lugbara tune:Kani")){
                    String title = "Ongo(124) Lugbara tune:Kani";
                    String subtext = "1. Mungu co adi amaniri de 'bo,\nEri co Opi Yesu ma arisi;\nEri le 'ba dria ma emu i vu,\nAri nde a'izu onzi yinisi.\n\n2. Mi ma 'yo mi 'ba alaru 'dini ku,\nMungu ni afa alaruri dria,\nEri ni ra ama 'ba onzi ada,\nMi nga ovu alaru ari ndesi\n\n3. Asi mini ma ama onzi mini,\nOnzi ci asi mini ma alia;\nMi ma ku onzi nde 'diyi Yesu dri,\nEri nga mi oji arisi.\n\n4. Mi ma ku e'yo onzi mini andru,\nMungu leni e'yo onzi mini ku;\nEri nga mi a'i asi ndrizasi.\nMi ka Opi Yesuni a'i andru.\n\n5. Mungu le 'ba dria ma fi bua ra,\nEri leni 'ba onzi ndre 'dale ku;\nOpi Yesu,mi oji ma alaru,\nMa le di mani mu fi 'bua indi.\n\n6. 'Ba ngapi acepi nyakua 'diyi\nYi nga ovu candi amboru alia;\nYi nga le apa Mungu ma alia,\nYini Opi Yesuni galerisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(125) Precious name")){
                    String title = "Ongo(125) Precious name";
                    String subtext = "1. Mi 'ba candini adaru,\n  Mi ndru andru\n    Yesuni;\nEri nga mi aza ko ra,\n  Candi mini atizu.\n\n    Aga ra,aga ra,\n    Ru Yesuni aga ra;\n    Angu 'daa,angu\n      'doa,\n    'Bua,nyakua indi.\n\n2. Mi ma bi Yesu ma ru\n    ci,\n    Okpo isuzu beni;\nMi nga onzi dria nde\n    ra,\n  Eri nga mi enga ra.\n\n3. Mi ma bi Yesu ma ru ci\n  Geri Onyirurisi;\nEri eco etu dria,\n  Vini inisi indi.\n\n4. Ama ma osi kumuti\n  Opi Yesu ma palaa,\nRuniri inzizu 'dani,\n  Diza fezu eri dri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(126) Jesus calls us")){
                    String title = "Ongo(126) Jesus calls us";
                    String subtext = "1. Yesuni ama omveni,\nAma bile ka yo ti;\nEri 'yo asi anzusi,\nMi emu ma vuti bi.\n\n2. Yesuni ndra 'ba omveria\nMiri Galilinia,\nYi ku emba pi aku be,\nYi ku dria Yesusi\n\n3. Yesuni 'ba omve 'dani\nE'yo onzi kuzu ja,\nAcizu geri iniria\nKililiru etuzu.\n\n4. Ayiko pi ma alia\nCandi amani be dria,\nYesuni ama omve ra,\nMi emu ma vuti bi.\n\n5. Yesuni ama omveni;\nMi eri o'dukoni,Mi fe asi mini dria\nAzi erini ngazu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(127)")){
                    String title = "Ongo(127)";
                    String subtext = "1. Yesu eri gerini,\nAma jizu Mungu vu;\nMinga ca 'dale indi,\nMi ka mu yesu vusi.\n\n    Yesuni Opini,\n    Ama eri ru inzi;\n    (x2)\n\n2. Yesu eri adani,\nEri lini inzo ku;\nEri eco mi dri ce\nImbata adarisi.\n\n3. Yesueri idrini,\nEji idri 'ba vuni;\nMi ka Yesuni a'i,\nMi idri isu ani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(128) Tune:O brothers,don't stay away")){
                    String title = "Ongo(128) Tune:O brothers,don't stay away";
                    String subtext = "1. Adripi,emi emu andru Yesu vu fo!\nAdripi,emi emu Yesu vu fo!\n\n  Yesuni ngonde mi pazu,\n  Mi ma emu eri vu fo!\n  Eri ngonde mi pazu;\n  Mi ma emu!\n\n2. Amvipi,emi emu andru Yesu vu fo!\nAmvipi,emi emu Yesu vu fo!\n\n3. Anzi la,emi emu andru Yesu vu fo!\nAnzi la,emi emu Yesu vu fo!\n\n4. 'Ba dria,emi emu andru Yesu vu fo!\n'Ba dria,emi emu Yesu vu fo!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(129) Jesus,I will trust thee")){
                    String title = "Ongo(129) Jesus,I will trust thee";
                    String subtext = "1. Yesu,ma mi a'i\nAsi driasi;\nEco mini onzi\nMani wuzaru.\n'Ba azini mile\nAluni 'de yo;\nMi dra pati ruaa\nOnzi 'banisi.\n\n2.Yesu,ma mi a'i,\nMi leta be tu;\nMini de ovuria\nAndra nyakua,\nMi omve 'ba onzi\nMi vu inyia;\nMi droni 'ba onzi\nAluni 'de ku.\n\n3.Ma eco mi a'i\nAsi mania,\nMa ka mi o'duko\nEri tro ku ti;\nOrindi miniri\nMa le ri mi palaa\nE'yo erizu.\n\n4. Yesu,ma mi a'i\nAsi driasi;\nMi nga 'ba emupi\nMi vuri a'i.\nMi ma omve mi vu\nAsi ndrizasi;\nMi 'Ba ma Papiri,\nMi Opi mani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(130) Iam trusting thee,Lord Jesus")){
                    String title = "Ongo(130) Iam trusting thee,Lord Jesus";
                    String subtext = "1. Ma mi a'i,Opi Yesu,\n  Mi a'dule'i;\nMi fe pata mini ma dri\n  Tokoru.\n\n2. Ma mi a'i,Opi Yesu,\n  Onzi wuzu ra;\nAsi ndriza fezu ma dri\n  Alesi.\n\n3. Ma mi a'i,Opi Yesu,\n  Onzi ojizu;\nMi nga ma ta mba etusi\n  Ini be.\n\n4. Ma mi a'i,Opi Yesu,\n  Mi nga ma dri ce;\nMa le lu mi vuti bi'i\n  Etu zu.\n\n5. Ma mi a'i,Opi Yesu,\n  Ma 'ba adaza;\nOkpo mani yo,te okpo\n Mi vu ci.\n\n6. Ma mi a'i,Opi Yesu,\n  Ma nga pa so ci;\nOkpo minisi ma ngani\n  Ande ku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(131) Just as Iam")){
                    String title = "Ongo(131) Just as Iam";
                    String subtext = "1. Ma 'ba onzi,ari mini\nRa e'yo onzi manisi;\nMini ma omvelerisi,\n  Yesu la,ma emu mi\n    vu.\n\n2. Ma 'ba onzi,ma econi\nOnzi mani inizu ku;\nTe ari mini eco ra,\n  Yesu la,ma emu mi\n  vu.\n\n3. Ma 'ba onzi,ma uri be,\nMa asini oti oti;\nTe mi asi anzuru fe,\n  Yesu la,ma emu mi\n  vu.\n\n4. Ma 'ba onzi,ini alia,\nEzata mani kakau;\nTe mi nga asi ndriza fe,\n    Yesu la,ma emu mi\n      vu.\n\n5. Ma 'ba onzi,mi ma\n    omve\nEmuzu andru mi vu ra;\nMini ma omvelerisi,\n  Yesu la,ma emu mi\n    vu.\n\n6. Ma 'ba onzi,ale mini\n  Se ma mi vuti bizuni;\nMa le ovu 'ba miniru,\n  Yesu la,ma emu mi\n    vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(132)")){
                    String title = "Ongo(132)";
                    String subtext = "1. Yesu le ma ma emu\nI vu a a'itasi;\nEri dra ma pazu ra,\nMani fizu idria.\n\n    Yesu le ma ra, (3)\n    Le ma avasi tu.\n\n2. Ma nga aci Yesu be,\nEri lezu avasi\nMa nga eri vuti bi,\nE'yo maniri kuzu.\n\n3. Yesu le ma avasi,\nEri ma dri ce zu zu;\nMa le azi erini\nNga ma asi driasi.\n\n4. Yesu 'Ba ma Papiri\nNga ma 'dui vu 'bua;\nAyiko maniri 'daa\nMile Yesuni ndrezu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(133) I hear thy welcome voice")){
                    String title = "Ongo(133) I hear thy welcome voice";
                    String subtext = "1.Yesu,mi ma omve\n  Ale minirisi,\nEzata mani ojizu\n  Ari minirisi.\n\n    Ma emu mi vu\n    Pati etia;\n    Ezata manisi\n\n2. Ma 'ba ezata be,\n  Ondi be tu indi;\nMi oji onzi mani dria\n  Ari minirisi\n\n3. Yesu,mi imba ma\nE'yo adarusi;\nMa leni geri ku 'de ku,\nMi ce ma dri drile.\n\n4. Mi ma fe ondua\nE'yo dria vazu;\nMa nga ma ona onzisi,\nDri ceta minisi.\n\n5. Mi fe ma dri okpo\nAzi mini ngazu,\nE'yo mini ma ta mbazu,\nOnyi 'yezu mi dri.\n\n6. Maru mini inzi\nPata minirisi;\nMini ma omvelerisi,\nMa nga mi vuti bi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(134) Jesus,my Lord")){
                    String title = "Ongo(134) Jesus,my Lord";
                    String subtext = "1. Yesu,andru ma mi omve,\n  Mi pa ma e'yo onzia;\nPata miniri ma le ra,\n  Mi ma a'i ma fo\n\n    Mi ma a'i ma fo, (2)\n    Mi arini ralerisi,\n    Mi ma a'i ma fo.\n\n2. Ezata mani mi ni ra,\n  Fe drinza ma dri amboru;\nTe ari mini ra masi,\n  Mi ma a'i ma fo.\n\n3. Azita miniri ma ta\n  Econi mani mbazu ku;\nTe mi ma ovu yiki be,\n  Mi ma a'i ma fo.\n\n4. Opi Yesu,mi ede ma\n  Kile mini lelerile;\nMi adri azi 'ye muke,\n  Mi ma a'i ma fo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(135) There is a city bright")){
                    String title = "Ongo(135) There is a city bright";
                    String subtext = "1. Yesu ede 'bua\nPari ndrizaru tu;\n'Ba ezapiri, (2)\nNgani fi 'dale ku.\n\n2. 'Ba 'ba Papiri la,\nMi emu ma vu ra;\nMi oji ma fo, (2)\nMi 'ba ma alaru.\n\n3. Opi,ma le ovu\nMva miniru ada;\nMi ko ma aza, (2)\nOnyi 'yezu zu zu.\n\n4. Opi,mi ce ma dri\nGeri miniria;\nMa nga ca 'bua, (2)\nYiki minirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(136) Pass me not")){
                    String title = "Ongo(136) Pass me not";
                    String subtext = "1. Yesu,mi ku ma 'de ku fo,\n  Mi ovu ma be;\nMi ka 'ba azini omve,\n  Mi omve ma'i.\n\n    Yesu Kristo,\n    Mi eri ma ra;\n    Mini 'ba azi omveria,\n    Mi omve ma fo.\n\n2. Ma asi ovu azoru,\n  Mi fe aro fo;\nMi idri maniri mi'i,\n  'Ba ma Papipri.\n\n3. Onyi mini ma a'i ra,\n  Mi 'ba onzi pa;\nMi asi 'bani omi ra\n  Asi ndrizasi.\n\n4. Asi ndriza mini ndruzu\n  Ma emu mi vu;\nMi ma oji ma alaru,\n  Mi nde ma ku fo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(137) Rock of Ages")){
                    String title = "Ongo(137) Rock of Ages";
                    String subtext = "1. Yesu Kristo Mungu\n  Mvi\nYi co ndra mi amasi;\nMa nga ma zi mi alia,\nMi oji ma arisi,\nMi 'ba ma alaru fo,\nMi pa ma onzi alia.\n\n2. Ma ka ovu candisi\nOnzi ma e'yosi ti,\nMa ka o'bi onyi 'ye;\nDria funi dri 'de ku;\nMi a'dule,mi eco\nMa pazu onzi alia.\n\n3.Ma ovu pililiru,\nMi osu ma bongosi;\nMa ovu 'ba ondi be,\nMi oji ma hwilili;\nOnyi mani yo ada,\nMi a'i ma yikisi.\n\n4. Mani nga ovuria\nIdri 'dori alia;\nMa ka nga vini mi ndre\nMini e'yo liria;\nYesu Kristo Mungu\n  Mvi,\nMa nga ma zi mi alia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(138) Jesus,Lover of my soul")){
                    String title = "Ongo(138) Jesus,Lover of my soul";
                    String subtext = "1. Yesu,'Ba ma Lepiri,\n  Ma nga nzu mi agatia;\nDe oliriko indi,\n  Ma nga di ma zi mi\n    vu.\nDe obeta nga indi,\n  Mi te ma agei fo;\nMi ce ma dri nyakua,\n  Ma a'izu 'bua ndo.\n\n2. Ma econi ma zizu\n  Pari azinia ku,\nKiri Yesu mi vu ka;\n  Mi pa idri mani fo.\nOnzini ma ezeza\n  Etu dripi dridrile;\nMi a'bu dri mani ci\n  Endri mini ma alia.\n\n3. Mi aga afa dria,\n  Ma le mi a'dule'i;\nYesu 'Ba ma Papiri,\n  Mi ati asi mani.\nMa 'ba onziruri'i,\n  Mi 'Ba onyi beri'i;\nMa ga ezatasi tre,\n  Mi 'Ba kililiruri.\n\n4. Mi asi ndriza e'i,\n  Mi ini onzi mani;\nMi 'ba ma alaru fo\n  Asi mani alia.\nMi yi a'di idrini,\n  Mi yi a'di idrini,\n  Mi ega ma asia;\nMani ovuzu ani\n  Idri 'dani 'dani be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(139)")){
                    String title = "Ongo(139)";
                    String subtext = "1. Ma 'ba onzi 'yepiri\nEzata be tre ada;\nMi eco onzi wuzu,\nYesu,mi ko ma aza.\n\n2. Onyi mani 'de yo fo,\nMa 'ye e'yo onzi tu;\nMi ni e'yo mani ra,\nYesu,mi ko ma aza\n\n3. Ma econi cazu ku\nDiza Munguniri vu;\nMa ani candi be tu,\nYesu,mi ko ma aza.\n\n4. Satani ombe ndra ma\nArujoa okposi;\nMi pa ma eri dria\nYesu,mi ko ma aza.\n\n5. Pati alaza dria\nMi co adi amani;\nKabilomva Munguni,\nYesu,mi ko ma aza.\n\n6. Mi enga dra alia,\nAma nga enga misi;\nMi eco 'ba pazuni,\nYesu,mi ko ma aza.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(140) Iam coming to the cross")){
                    String title = "Ongo(140) Iam coming to the cross";
                    String subtext = "1. Ma emu,Yesu,mi vu\n  Alioru pirini;\nMa ku afu mani ja,\n  Pata a'iz mi vu.\n\n    Ma pata a'i mi vu,\n    Kabilomva Munguni;\n    Ari mini ra masi,\n    Mi eco ma pazuni.\n\n2.Yesu,ma 'ba onzi tu,\n  Ma ga ezatasi tre;\nTe mi dra pati ruaa\n  Ma pazu onzi alia.\n\n3. Eli karakarau\n  Ma ati'bo onzini;\nAndru ma mi a'i 'di,\n  Yesu 'Ba ma Papiri.\n\n4. Yesu,ma le ma idri\n  Fezu pi mi dri andru,\nMa orindi pie dria,\n  Rua mani be indi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(141) I'm troubled in mind")){
                    String title = "Ongo(141) I'm troubled in mind";
                    String subtext = "1. Ma ovu candi be asi mania;\nMa nga mu Yesu vu,eri ma pa ra.\n\n2. Onzi mani teri nzizaru ma dri;\n\n3. Mani ini ma alia,ma mile di yo;\n\n4. Ma asi anyoru,ma ande kai ra;\n\n5. Ma nga Yesuni zi,eri eri ra;\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(142) The Church's one foundation")){
                    String title = "Ongo(142) The Church's one foundation";
                    String subtext = "1. Kanisa ma etiri\n  Lu Yesu ma Kristo'i;\nSi i Yesu ma dria,\n  Eti andini yo.\nYesu emu nyakua\n  Amurua ndazu;\nOji eri alaru\n  Ari inirisi.\n\n2. 'Ba Kristoni yi enga\n  Suru dria alia,\nEci yi 'ba aluru\n  Yesu ma alia;\nYi Opi inzi alu,\nAsisile alusi\n  Yi Yesu vuti bi.\n\n3. Afu ka ovu indi\n  Esele coza be,\nKanisani pa so ra\n  A'itasi 'dani;\n'Ba alatararu 'diyi\n  Yi Mungu zi 'dani,\nMungu nga di ani\n  Kanisa ta mba ra.\n\n4. De 'ba kanisani 'diyi\n  Ovu nga nyakua,\nYi a'di 'di okposi\n  Ande likokoru;\nTe yi nga ari'ba nde,\n  Yi nga ava li ndo,\nYi nga asi anzuru\n  Isu 'bua 'dale\n\n5. 'Ba fipi 'bua 'bo 'diyi\n  Yi ama be alu;\nYi ti eci Mungu be\n  Ale erinisi\nOpi,mi fe ama dri\n  Asi ndriza mini,\nAma ofizu yi be\n  Ovuzu mi be 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(143) For all the saints")){
                    String title = "Ongo(143) For all the saints";
                    String subtext = "1. Yesu,ama mi ru inzi 'dani,\n'Ba alaru ndra drio 'diyisi;\nYi e'da mi ru 'ba ma milia,\n    Haleluya,Haleluya!\n\n2. Mi ce ndra yi dri,yi agei tezu,\nMi fe ndra yini onzi ndezu ra;\nAngu ka bi ti,mi diza yini,\n\n3. Ama di asikai mini 'diyi,\nMi fe ama 'ba omba okposi;\nAma ma aga 'ba nde 'dayile,\n\n4. Omba ka tro ovu okporu ti,\nAma co bile ongo yini vu;\nYi ongo agazuri ngo 'dani,\n\n5. Ama nga omba 'ba va nyakua,\nAma nga di ava li yi be ndo\nPari ndrizaru tu 'buaria;\n\n6. Mi lu,anguni nga ati ati,\nOpi dizaniri nga emu ra;\nAma nga ovu yi be tualu,\n\n7. Ama engapi angu dria 'diyi,\nAma nga fi aku 'buaria;\nAma nga Mungu ru inzi 'dani,\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(144) The Son of God goes forth to war")){
                    String title = "Ongo(144) The Son of God goes forth to war";
                    String subtext = "1. Mungu pe Mvi ini ma\n    ti,\n  'Di a'di onzi be;\nEri ma okpo aga ra,\n  Eri agupini.\n\n2. 'Ba pati alaza 'dupi\n  Candini nyapi 'diyi,\nYi aci Yesu be 'dani;\n Yi 'ba erini 'diyi.\n\n3. 'Ba andra yini ocole\n  Yesu ma rusi 'diyi\nRi Mungu zi asi basi\n  Ari'ba yini dri.\n\n4. Yini Stefano furia,\n  Osi kumuti va;\nNdre Yesuni pa soria\n  Mungu dri ndiria.\n\n5. 'Ba Yesuni,onyi be 'diyi\n  Yi ndra 'ba kakau;\nYesu rusi 'ba eve yi,\n  Di yi pati ruaa.\n\n6. Yi o'be 'ba azini 'diyi\n  Kami ma 'bilea;\nOli azini seisi,\n  Te ti,yi asite.\n\n7. 'Ba kakau a'ipi 'diyi,\n  'Ba 'wara anzi be,\nYi fe ayiko Yesu dri\n  Ewu yinisi dria.\n\n8. Opi Yesu,ama mi zi\n  Candi amanisi;\nMi fe okpo ama dri fo\n  Asi ndriza pie.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(145) Through the night of doubt and sorrow")){
                    String title = "Ongo(145) Through the night of doubt and sorrow";
                    String subtext = "1. 'Ba acipi 'diyi aga\n  Angu candini alia;\nYi mu 'dani 'bualeru,\n  Ngozu asi driasi.\n\n2. Angu biza inicici\n  Feni yi dri uri ku;\nAngu yi ma driliari\n  Ovu diza be ambo.\n\n3. 'Ba Yesuni opale 'diyi\n  Yi aci diza alia;\nDiza Yesu Kristoniri\n  Angu 'i yi vu 'dani.\n\n4. Ama aci geinia\n  Asisile alusi;\nAma dria ori'baru\n  Asi teza be alu.\n\n5. 'Ba ama Papiri alu,\n  Eci ama tualu;\nOngo amaniri alu,\n  Runi inzizuri'i.\n\n6. Ama ka ca 'bua 'dale,\n  Ama ayiko isu;\nAta amaniri alu,\n  Ama nga ri eri be.\n\n7. Ama ma mu ani drile\n A'di 'dizu onzi be;\nPati alazaru 'duzu,\n  Yesu ma vuti bizu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(146) Whither,pilgrims,are yo going?")){
                    String title = "Ongo(146) Whither,pilgrims,are yo going?";
                    String subtext = "1. Emi 'ba acipi 'diyi,\n  Emi di mu kpere\n    ngoa?\nAma mu geri Yesuni\n  Ecele 'ba driria.\nGeri Yesuni izuru\nCazu kpere 'bua ra;\nAma mu aku amboa,\n  Angu 'dari aga dria.\n\n2. Ama mu uru 'bua ra,\n  Angu 'daleri ndri tu;\nOpini nga onyi pi fe\n  Ama dri diza pie.\nAma nga ri va Mungu\n    be,\nAma nga Yesuni ndre,\nAma nga runiri inzu;\n  Angu 'dari aga dria.\n\n3. Emi 'ba acipi 'diyi\n  Ma a'i ama muzu\n'Bua tualu emi be;\n  Ama le mu indi fo!\nYesuni nga ama a'i,\nNga emi a'i indi,\nAngu ndrizaru alia;\n  Angu 'dari aga dria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(147)")){
                    String title = "Ongo(147)";
                    String subtext = "1. Ba Yesuni pani yi yi drisi ku;\nOkpo yiniri yo,Yesu pa yini.\n\n    Ama ati'bani,ama Yesuni;\n    Ndra ama Satanini,ama apa'bo.\n\n2. Ama 'ba Yesuni opale ra 'diyi,\nAnzi Munguni asi o'diru be.\n\n3. Ama ori'ba eri akua 'diyi,\nEri ngani ama 'be amve 'de ku.\n\n4. A'di eji ama Mungu vunini?\nYesu eji ama,dra inisini.\n\n5. A'di je ama onzi aliani?\nYesu je amani,ari inisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(148) We love the place,O God")){
                    String title = "Ongo(148) We love the place,O God";
                    String subtext = "1. Ama le,Mungu la,\nOvu jo minia;\n'Diri ayiko fe,\nRu mini egazu.\n\n2. Jo mini alia\nAma emu mi vu;\nLe mi ma mile ndre,\nAma 'ba mini 'diyi.\n\n3. E'yo mini eri\nAluzaru ada;\nEri ayiko fe\n'Ba ma asiani.\n\n4. Ama ka omu nya\nMesa mini tia,\nMi fe 'ba mini dri\nNyaka idriniri.\n\n5.Ongo mini ngozu\nEri candi dro ra;\nEri okpo fe ra,\nAyiko be 'dani.\n\n6. Ama mi ru inzi\nLeta minirisi;\n'Yeta amani 'diyi\nMa fe diza mi dri.\n\n7. Mi fe ava mini\nMa va ma nyakua,\nVilerisi 'bua\nMa nga mi mile ndre.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(149) What a friend we have in Jesus")){
                    String title = "Ongo(149) What a friend we have in Jesus";
                    String subtext = "1. Agyi amaniri Yesu\n  Wu ezata amani;\nAma ovu drilebaru\n  Eri zizu etuzu.\nAma nga candi isu ra,\n  Ka zi Mung tia ku;\nAma asi anzu be ra,\n  E'yo zizu etuzu.\n\n2. Satani ka mi obe ra,\n  Ka mi dri ici ambo,\nAsi mini ma oti ku,\n  Mi mu Yesuni zizu.\nAgyi Yesuleni yo fo,\n  Asi 'bani omizu;\nYesu ni candi mini ra,\n  Mi mu Yesuni zizu.\n\n3. Rua mini ka ande ra,\n  Asi mini ka oti,\nEri nga mi aza ko ra,\n  Mi mu Yesuni zizu.\nAgyi mini ka mi ku ra,\n  Mi mu coti Yesu vu;\nEri nga mi a'i 'dani,\n  Mi nga ayiko isu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(150) I must tell Jesus")){
                    String title = "Ongo(150) I must tell Jesus";
                    String subtext = "1. Ma e'yo ma inzapiri olu,\nMa ngani oci Yesu dri ku;\nMa ka e'yo zi,eri nga fe ra,\nEri asi anzuru feni.\n\n    Ma Yesuni lu,ma Yesuni lu,\n    Econi mani a'dule ku;\n    Ma Yesuni lu,ma Yesuni lu,\n    Eri nga candi amani wu.\n\n2. Ma nga candi mani e'da dria,\nEri candi dro,asi fe ba;\nEri ma asi omi etuzu,\nEri 'Ba asi Omipiri.\n\n3. E'yo nyakuni yi ma obe ra,\nSatani le ra ma zezu va;\nMa nga lu Yesu vu etu dria,\nMa nga okpo isu eri vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(151) Come,my soul,thy suit prepare")){
                    String title = "Ongo(151) Come,my soul,thy suit prepare";
                    String subtext = "1. Asi mani,mi enga\nMi esizu Mungu vu;\nEri mi imba zizu,\nEri ngani mi ga ku\n\n2. Eri asi ndriza be,\nEri okpo ma e'i\nE'yo mini zile 'di\nNdeni Munguni 'de ku.\n\n3. Yesu,Opi mani la,\nMi ma eri zita 'di;\nE'yo onzi nde ma ra,\nMi 'du teri mani fo.\n\n4. Ari mini adale\nEzata 'banisiri\nMa oji ma nditiri,\nAsi anzuru fezu\n\n5. Opi,ma emu mi vu\nAnde liza isuzu;\nMa kulumgbu mini 'du,\nE'yo onizu mi vu.\n\n6. De mani aciria\nNyaku 'dori alia,\nMi fe ale miniri\nMa ga ma asia tre.\n\n7. Yesu,agyi maniri\nMi ce ma dri 'dani fo;\nAza koza minisi\nMa nga ca ani 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(152) Tune:Prayer is the key to heaven")){
                    String title = "Ongo(152) Tune:Prayer is the key to heaven";
                    String subtext = "    Ama zi Mungu 'dani; (3)\n    Eri eri ra\n\n1. Ama zi Mungu tualu;\n  Eri eri ra\nEri le ama avasi;\n  Eri eri ra.\n\n2. Ama zi asi driasi;\n  Eri eri ra.\nAma zi asi adasi;\n  Eri eri ra.\n\n3. Ama zi andekokoru;\n  Eri eri ra.\nEri asi ndriza be tre;\n  Eri eri ra.\n\n4. Ama zi Yesu ma rusi;\n  Eri eri ra\nEri nga e'yoni 'ye ra;\n  Eri eri ra.\n\n5. Ama zi Mungu etuzu\n  Eri eri ra.\nAma ngaayiko isu;\n  Eri eri ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("ongo(153) Tune:And I couldn't hear nobody pray")){
                    String title = "ongo(153) Tune:And I couldn't hear nobody pray";
                    String subtext = "    Munguni Ata amaniri,\n    Eri ngonde ama erizu;\n    (x2)\n\n1. Ama emu (ngonde ama erizu) e'yo zizu,\nE'yo zizu (ngonde ama erizu)  Mungu tia.\n  (Mungu)\n\n2. Yesu kini (ngonde ama erizu) 'ba yi ma zi,\n'Ba yi ma zi,(ngonde ama erizu) ma ande ku\n  (Mungu)\n\n3. Yesu kini (ngonde ama erizu) ama ma zi\nAta tia (ngonde ama erizu) i ma rusi.\n  (Mungu)\n\n4. Yesu kini (ngonde ama erizu) ama ka zi,\nMunguni nga (ngonde ama erizu) afa fe ra.\n  (Mungu)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(154) Come ye yourselve apart")){
                    String title = "Ongo(154) Come ye yourselve apart";
                    String subtext = "1. Emi emu kalaa ande lizu,\nPari 'bani ovuz yoria,\nOtreza 'bani ka emi inza,\nEmi emu mavu okpo ndazu.\n\n2.Emi ku afa nyakuni 'diyi,\nEmi ma ndru lonyi 'buari'i;\nEmi ri ma vu Ata mani be,\nEmi a'dule ku,ama indi.\n\n3. Emi olu e'yo emini fo,\nAyikoru kani candiru ti,\nE'yo mi ndepi ra 'diyi pie;\nMa ni ra azi mani ewaru.\n\n4. Geri izuru,emi li ande.Emi ava kazu otizu ku;\nEmi 'du nyaka mani feleri,\nEmi emu yi idriniri mvu.\n\n5. Emi nga mvi azi eminia,Azi 'yezu okpo o'dirusi;\nEtu emini ovuzu ma be\nEri emi dri orodriru tu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(155) Resting in the everlasting arms")){
                    String title = "Ongo(155) Resting in the everlasting arms";
                    String subtext = "1. Ama ti eci,ayiko isu,\n  Atizu Yesu agatia;\nAsi anzu pi ava be indi,\n  Atizu Yesu agatia.\n\n    Mi ati mi,\n    Mi ati Yesu agatia;\n    (x2)\n\n2. Adriza muke tezu Yesu be,\n  Atizu Yesu agatia;\nAciza baru geri alaria,\n  Atizu Yesu agatia.\n\n3. Ama wuni ku,candi vini yo,\n  Atizu Yesu agatia;\nAsi anzuru ama isu ra,\n  Atizu Yesu agatia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(156) Safely through another week")){
                    String title = "Ongo(156) Safely through another week";
                    String subtext = "1. O'du 'di Sabatoni;\nMungu ama ca mi vu,\nAma 'yo awa'difo\nTa mbaza minirisi.\n\n    O'du 'diri aga dria,\n    Ama ti eci mi be;\n    Ace were ama nga\n    Ava li mi be 'dani.\n\n2. Ama emu mi vu 'do,\nRu Yesu Kristonisi;\nMi dro e'yo onzi dria,\n'Ba ama alaru fo.\n\n3. Mungu,mife o'du 'di\nAma dri ava lizu,\nAzi ngaza ma vutia,\nRu miniri inzizu.\n\n4. E'yo mini ma ku ku\nAngu wudrikurua;\n'Ba ezata 'yepi 'diyi\nMa isu pata andru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(157) This is the day of light")){
                    String title = "Ongo(157) This is the day of light";
                    String subtext = "1. O'du Sabatoni\nEri dizaniri;\nOpi,mi fe diza mini\nAngu biza 'izu.\n\n2. O'du 'diri eri\nO'du engatani;\nYesu,mi ma enga ama enga ama\nOnzi aliasi.\n\n3. Orindi Munguni,\nMi emu ama vu,\nAsi amani imbazu\nE'yo Yesunisi.\n\n4. Ama emu,Mungu,\nMi vu e'yo zizu;\nMi esi ama vu inyia,\nAma erizu fo.\n\n5. Ama o'bi andru\nE'yo bari olu;\nMi fe 'ba ma oja asi\nYesuni a'izu.\n\n6. Mi fe ava liza\nO'du andrurisi,\nMi fe okpo mini 'ba dri\nAzi mini ngazu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(158)")){
                    String title = "Ongo(158)";
                    String subtext = "Afa onyiru dria 'diyi\nEnga mi vu,Mungu;\nTe afa mini fele 'diyi\nAma omvi mi vu. (2)";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(159) Tune:Lord,I want to be a Christian")){
                    String title = "Ongo(159) Tune:Lord,I want to be a Christian";
                    String subtext = "1. Mungu,mi fe asi ndriza\nAma dri 'bo,ama dri 'bo;\nAma fe awa'difo amani mi dri.\n\n    Awa'difo fezu mi dri,\n    Ama fe awa'difo amani mi dri.\n\n2. Mini 'ba nyakua 'diyi\nLelerisi,lelerisi,\nAma fe awa'difo amani mi dri.\n\n3. Afa driani engale\nMi vurisi,mi vurisi;\nAma fe awa'difo amani mi dri.\n\n4. Ama asi ovu 'doa\nAyikosi,ayikosi;\nAma fe awa'difo amani mi dri.\n\n5. Ama feta fe mi dri 'di\nInzitasi,inzitasi;\nAma fe awa'difo amani mi dri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(160)")){
                    String title = "Ongo(160)";
                    String subtext = "1. E'yo Munguni eca ndra\n  Angu amania,\nEzata kuzu onyi 'yezu,\n  Ayiko indi.\n\n    Ru Yesuni inzizaru,\nInzizaru tu;\nAwa'difo,awa'difo\nAma di fe ra.\n\n2. Fe omba 'bani i dezu,\n  Fe nita ama dri,\nImbata pi aro pie;\n  Mungu 'ye onyiru.\n\n3. Mungu fe jo kanisani\n  Ama dri avasi,\nAmani e'yo Munguni\n  Erizu etuzu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(161) I hunger and I thirst")){
                    String title = "Ongo(161) I hunger and I thirst";
                    String subtext = "1. Abirini ma fu,\n  Ma yi avijo be;\nYesu,mi nyakani\n  Ma dri,yi mvuza be\n\n2. Mikate idriru\n  Engapi 'buari,\nMi fi ma asia\n  Ma kazu drazu ku.\n\n3. Pati zabibuni\n  Adaruri mi'i;\nMi fe andru ma dri\n  Afa mvuzari fo.\n\n4. Geri ewaru tu,\n  Ma ande fudri ci;\nMi fe mani okpo,\n  Mi nyaka idrini.\n\n5. Ma mani aci 'do\n  Roko drialeru;\nYi rapi 'daniri,\n  Mi era ma asia.\n\n6. Mini nyaka fele\n  Ma dri yi berisi,\nMa nga okpo isu\n  Mi vuti bizu zu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(162)")){
                    String title = "Ongo(162)";
                    String subtext = "1. Emi ega e'yo Yesuniri,\nDratani rua suza beri'i;\nEri dra ndra 'ba a'ipi 'diyi\nPazu e'yo onzi ma alia.\n\n2. Emi emu inyia,emi 'du\nEceta rua pini ari be;\nEri fe i ma rua amasi,\nArini ra ama onzezuni.\n\n3. Emi emu asi e'yere be,\nEmi e'da ezata emini;\nYesu dra pati alaza dria,\nEri ari ra onzi wuzuni.\n\n4. Emi emu asi adarusi,\nEmi a'i Yesu emi asia;\nEceta fele emi dri 'diyi\nYesu ma asi ndriza eceni.\n\n5. Omu Opini 'dori ma alia\nAma eci ti Yesu be ada;\nFe ama ovu ori'ba alu\nAmani mikate alu nyaria.\n\n6. Ama Yesu ma drata ece'i,\nDe nga emvini dika 'doa ku;\nAma awa'difo fe eri dri,\nErini ama opalerisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(163) Let us break bread together")){
                    String title = "Ongo(163) Let us break bread together";
                    String subtext = "1. Ama ma nya mikate tualu. (2)\n    Ama ori'bani;\n    Ama nya omu tualu\n    Opi Yesu ma rusi.\n\n2. Ama dria mvu patiefi su. (2)\n\n3. Ama ovu dria adripiru. (2)\n\n4. Mungu,ama mi inzi tualu. (2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(164) Speak,Lord,in the stillness")){
                    String title = "Ongo(164) Speak,Lord,in the stillness";
                    String subtext = "1.Opi,mi 'yo e'yo,\n  Mani teria;\nBile mani mgboru\n  E'yo erizu.\n\n2. Mi 'yo,Opi mani,\n  Etu 'disi fo;\nMa le mi mile ndre,\n  Okpo isuzu.\n\n3. E'yo mini ovu\n  E'yo idrini;\nMi fe ma ma nya ra,\n  Nyaka 'buniri.\n\n4. Mi se ma mi vu fo,\n  Opi maniri,\nOvuzu 'ba mini,\n  Mini a'dule.\n\n5. Opi,mi 'yo e'yo\n  Mini leleri;\nMi imba ma asi\n  Acizu mi be.\n\n6. Opi,mi 'yo e'yo,\nMa mi ati'bo;\nMa le e'yo mini\n  Eri curu'do.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(165) Lord,speak to me")){
                    String title = "Ongo(165) Lord,speak to me";
                    String subtext = "1. Yesu,mi 'yo e'yo ma tia;\nMa nga di mu e'yo olu;\nMa nga 'ba avizaru ndru,\nMini ndra ma ndrulerile.\n\n2. Opi,mi ce ma dri 'dani,\nMa ma ce 'ba ma dri beni;\nMi fe enya ma asia,\nMa fe ta idrini 'ba dri.\n\n3. Mi fe ma dri okpo mini,\nMani pa sozu kilili;\nMa 'ba e'depi va diyi\nEnga ani mi okposi.\n\n4. Mi imba ma,ma nga ani\nE'yo mini imba 'ba dri;\nMi fe okpo ma tilea,\nE'yoni fizu 'ba asia.\n\n5. Mi fe ale mini ma dri,\nEri ma ga ma asia;\nMa nga ani e'yo olu\nAsi ndriza minirisi.\n\n6. Opi,ma le mi ayu ma\nKile mini lelerile;\nMi ma ayu ma nyakua,\nMa nga ca mi vu 'bua ndo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(166) Hushed was the evening hymn")){
                    String title = "Ongo(166) Hushed was the evening hymn";
                    String subtext = "1. Yi de ongo ngozu hekalu Mungunia,\nAnguni biria 'ba mu o'du kozu;\n  O'duko nga enga coti,\n  Mungu omve Samuelini.\n\n2. Mungu,mi fe ma dri e'yo erizu fo,\nMa le andru o'duko mini erizu;\n  O'duko ka tro were ti,\n  Ma nga e'yoni 'ye coti.\n\n3. Mungu,mi fe ma dri asi e'yereru,\nMani e'yo mini 'yoleri erizu;\n  Etusi kani inisi,\n  E'yo miniri 'yezu'i.\n\n4. Mungu,mi fe ma dri egata onyiru,\nMani e'yo mini lezu avasi fo;\n  Ma le e'yo adaru ni,\n  Ma ma inzi mi ru indi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(167) The joyful news")){
                    String title = "Ongo(167) The joyful news";
                    String subtext = "1. E'yo ambo eca ra,\nE'yo bari Yesuni;\nMi olu angu dri dria\nE'yo 'ba opazuri.\n\n2. E'yo onyi be 'diri\n'Ba asi ambizuri,\nMunguni 'ba lezuri;\nAma e'yo 'diri ngo.\n\n3. Yesu dra pati ruaa\nAdi amani cozu;\nEji ama Mungu vu'\nI ma dratasi ada.\n\n4. 'Ba yi aci ndra saaru,\n'Ba yi dri cepini yo;\nYesu emu ama vu\nEri ama dri ceni.\n\n5. E'yo ayikoru 'di\nEga 'ba asia tre;\nMi emu e'yo eri,\nMi nga ayiko isu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(168) We have heard the joyful sound")){
                    String title = "Ongo(168) We have heard the joyful sound";
                    String subtext = "1. E'yo ayikoruri:\n  Yesuni 'ba opa!\nMi mu ayiko olu:\n  Yesuni 'ba opa!\nMi mu suru vusi dria\nE'yo bari oluzu\nAngu wudrikuru dria:\n  Yesuni 'ba opa!\n\n2. Mi ma ngo a'di alia:\n  Yesuni 'ba opa!\nDrata erinirisi:\n  Yesuni 'ba opa!\nMini candi nyaria,\nDra ka ovu inyia,\nMi ma ngo ongo 'diri:\n  Yesuni 'ba opa!\n\n3. Ayiko 'ba dria dri:\n  Yesuni 'ba opa!\nMi mu e'yoni olu:\n  Yesuni 'ba opa.\nMi olu e'yo bari\nAngu dalakarua,\nOluzu oni dria:\n  Yesuni 'ba opa!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(169) Wonderful words of life")){
                    String title = "Ongo(169) Wonderful words of life";
                    String subtext = "1. Mi ma ngo e'yo Yesuni,\n  E'yo idriniri!\nE'yo nde aluzaru tu,\n  E'yo Yesuniri!\nYesu emu nyakua\nAma opazu dria,\n\n  E'yo bari,e'yo bari,\n  E'yo idriniri!\n  (x2)\n\n2. Yesu eji 'ba dria vu\n  E'yo idriniri!\n'Ba avipiri ma eri\n  E'yo Yesuniri!\nYesu fe asi ndriza\nOnzi amani wuzu,\n\n3. Mi olu e'yo bari 'di,\n  E'yo idriniri!\nMi ma ece 'ba dria dri,\n  E'yo Yesuniri!\n'Ba ka e'yo a'i ra,\nYesuni nga yi pa ra,\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(170) For my sake and the gospel's go")){
                    String title = "Ongo(170) For my sake and the gospel's go";
                    String subtext = "1. Mi mu e'yo bari olu,\n  Ru Yesuni ekuzu.\n'Ba Yesuni ti pele 'diyi\n  Kini,'Yeke,a mu di!\nYi olu e'yo erini\n  Diza fezu eri dri;\nYi ku afa yini dria\n  Opi Yesu Kristosi.\n\n2. 'Ba Yesu ru olupi 'diyi\n  M suru vusi dria,\nE'yo patani oluzu,\n  E'yo bari Yesuni.\nE'yo liza 'ye eca ra;\n  De ewu ecani ku,\nE'yo bari ma 'i angu,\n  Angu bizani drozu.\n\n3. Angu wudrikuru dria,\n  'Ba yi Haleluya ngo;\nYi ru Yesuniri inzi\n  Pata erinirisi.\nYi mu e'yo bari olu\n  'Ba osezu Yesu vu;\nYi o'bi 'ba imba indi\n  E'yo Yesunirisi.\n\n4. Guka Yesuniri nga wu\n  'Ba ini okuzu ra;\nEri nga opi nya 'dani\n  'Ba dria ma drilia.\nAma 'ba mini,Yesu la\n  Ama le mi vuti bi;\nAma mu e'yo oluzu\n  De nga mi emviniku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(171) Tune:John Brown's body")){
                    String title = "Ongo(171) Tune:John Brown's body";
                    String subtext = "1. Ama ma mu e'yo bari oluzu, (3)\n  E'yo bari Yesuni.\n\n    Haleluya,Haleluya ! (3)\n    Awa'difo,Yesu.\n\n2. Ama ma mu 'ba eripi kuri vu\nAngu wudrikuru dria ma alia;\nAma ma mu e'yo bari oluzu,\n  E'yo bari Yesuni.\n\n3. 'Ba Opi Yesuni gapi si 'diyi\nYi nga dra ada,ezata yinisi;\nAma ma mu e'yo bari oluzu,\n  E'yo bari Yesuni.\n\n4. 'Ba eripi ku 'diyi o'biru tu,\nYi ovu angu iniru ma alia;\nAma ma mu e'yo bari oluzu,\n  E'yo bari Yesuni.\n\n5. E'yo bari Opi Yesu Kristoni\nEri okpo Munguni 'ba pazuri;\nAma ma mu e'yo bari oluzu,\n  E'yo bari Yesuni.\n\n6. Ama ma mu e'yo bari oluz, (3)\n  E'yo bari Yesuni.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(172) To the regions beyond")){
                    String title = "Ongo(172) To the regions beyond";
                    String subtext = "1. Ma mu e'yo Munguni oluzu 'dale,\nPari oluzu nga kuria;\nMa mu leta Yesuni 'ba vuri ece\nJuru dri;yi erini nga ku (nga ku).\n\nMa ma mu...'ba e'yo...eripi...kuri vu;\n    (ma nga mu...vapi ku...\n      eripi kuri vu,ma nga mu;)\nMa ma ku...e'yo ba...orodri...si dria.\n    (ma ma ku...patani...\n    orodrisi dria.dria.)\n\n2.Ma ka tro azazaru 'ba milia ti,\nMa nga Yesu ma vuti bi ra,\nMuzu e'yo oluzu angu andia\nKpere pari ewaruria(ma mu).\n\n3. Yesu emu ndra 'ba avipi 'diyi ndru,\nEri ndru ma,isu di ma ra;\nKabilo avizaru azini indi,\nMa le mu yi eji licoa (licoa).\n\n4. Mi ovupi aku minia 'daniri,\nLonyi okupi mi didi'i,\nMi ma eri o'duko Yesuniri fo,\nMi enga muzu angu andia (mi mu).\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(173) Rescue the perishing")){
                    String title = "Ongo(173) Rescue the perishing";
                    String subtext = "1. Mi nzu 'ba onzi vu e'yo oluzu,\n  Yi 'ye odra onzi yinisi 'daa;\nYi ovu candi be dra ma alia,\n  Mi nzu yi vu e'yo idrini be\n\n    Mi ma mu mbele tu e'yo oluzu,\n    De nga 'ba drani ku onzi alia!\n\n2. 'Ba 'ye Satanisi urisi indi,\n  Eri yi ombe okposi ada;\nYesu 'ba Papiri le yi opa ra,\n  Mi mu mbele e'yoni oluzu.\n\n3. Angu iniria yi avizaru,\n  'Ba yi nda geri idriniri ti;\nEmi 'ba ava be,emi mu mbele\n  Yi omvezu de etu nga indi!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(174) Let the song go round the earth")){
                    String title = "Ongo(174) Let the song go round the earth";
                    String subtext = "1. 'Ba angu dri dria 'diyi\n  Yi ma ngo ongo\nYesuni inzizu fo!\n  Eri Opini\n'Ba dria ma ngo ongo\nRu Yesuni ekuzu.\n\n2. 'Ba inru 'diyi dria\n  Yi ma ngo ongo\nYesuni inzizu fo!\n  Eri Opini.\n'Yeta Yesuni dria\nMa ku Afrika alia.\n\n3. 'Ba ekaru 'diyi dria\n  Yi ma ngo ongo\nYesuni inzizu fo!\n  Eri Opini.\nEtuni efuria\nYi ma inzi Yesuni.\n\n4. 'Ba emveru 'diyi dria\n  Yi ma ngo ongo\nYesuni inzizu fo!\n  Eri Opini.\nYesu ru ma ku indi\nUlaya ma alia.\n\n5. 'Ba angu dri dria 'diyi\n  Yi ma ngo ongo\nYesuni inzizu fo!\n  Eri opini.Ama ma inzi eri,\nKristo 'Ba 'ba Papiri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(175) Thou whose almighty word")){
                    String title = "Ongo(175) Thou whose almighty word";
                    String subtext = "1. Mungu,e'yo mini\nFe ndra angu 'izu,\n  Ini drozu;\nMi eri ama fo,\nAngu iniria,\nMi fe e'yo bari\n  Angu 'izu.\n\n2. Opi Yesu Kristo,Mi diza nyakuni,\n  Mi emu ndra\n'Ba mile atizu;\nEwu amanisi\nMi fe e'yo bari\n  Angu 'izu.\n\n3. Orindi adani\n'Ba idri Fepiri,\n  Mi emu fo;\nMi eji asi ba\n'Ba onzi 'diyi vu;\nMi fe e'yo bari\n  Angu 'izu.\n\n4. Ata,Mvi,Orindi:\nMungu amaniri\n  Ale be tu,\nLe wudrikuru dria\nMa ndre diza mini;\nMi fe e'yo bari\n  Angu 'izu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(176)")){
                    String title = "Ongo(176)";
                    String subtext = "1. Mungu,mi fe ma dri andru\n  E'yo miniri fo;\nMi fe okpo ma dri zu zu,\n  Ma mu ani drile. (2)\n\n2. Te pari mini lezu ma\n  Ma mu aniria,\nGeri ka tro ewaru ti,\n  Ma ngani ru 'de ku. (2)\n\n3. Mungu mani,mi fe ma ga\n  Agata mi be ku;\nTe ma le e'yo dria 'ye\n  Mini lelerile. (2)\n\n4. Ma ka tro alioru ti,\n E'yo azini yo;\nMa ngani wu afasi ku,\n  Mi nga ma ta mba ra. (2)\n\n5. Mi fe amani adrizu\n  Nyakua alesi,\nAma nga ani ca 'bua\n  Mi vu ayikosi. (2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(177) I love to tell the story")){
                    String title = "Ongo(177) I love to tell the story";
                    String subtext = "1. Ma le e'yo Yesuni 'yo,\n  E'yo aluzaru;\nEce ama dri Yesu\n  Diza nyakuniri;\nEce Yesu ma ale\n  Ama lezuri'i;\nMa le e'yo Yesuni,\n  Eri fudri ma dri.\n\n    Ma le e'yo Yesuni\n    Oluzu etu dria,\n    Ecezu 'ba dri dria\n    Yi pa yi Yesusi.\n\n2. Ma le e'yo Yesuni 'yo,\n  E'yo osutaru;\nAga egata 'bani\n  Egale 'diyi dria\nMa le e'yo Yesuni,\n  Ko ma aza ada;\nMa olu e'yo nderi\n  Ani mi tia 'do.\n\n3. Ma le e'yo Yesuni 'yo,\n  E'yo onyiru tu;\nOluzu dika dika\n  Aluzani nde ra.\nTe 'ba azini indi\n  Yi erini nga ku,\nPata ma e'yo 'dori\n  Buku Mungunia.\n\n4. Ma le e'yo Yesuni 'yo,\n  Nyaka idriniri;\nAbiri ka 'ba fu ra,\n  Yi tra e'yo ndesi.\nMa ka ca 'bua 'dale\n  Ma nga e'yo 'di ngo,\nRu Yesuni inzizu\n  Ma asi driasi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(178) Tune:We need more reapers")){
                    String title = "Ongo(178) Tune:We need more reapers";
                    String subtext = "1. Ama le olu'ba azini 'diyi\nAzi ngazu Mungu dri.\n(x2)\n\nAnzi,emi mu azi nga,\nEmi mu azi nga.\n(x2)\n\n    Emi ma mu azi nga, (3)\n    Emi mu azi nga.\n\n2. Ama le imba'ba azini 'diyi,\n\n3. Ama le 'ba agupiru 'diyi,\n\n4. Ama le oku piyi anzi be 'diyi,\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(179) Fight the good fight")){
                    String title = "Ongo(179) Fight the good fight";
                    String subtext = "1. Mi ma 'di a'di okposi,\nYesuni idri miniri;\nEri nga okpo fe mi dri\nE'yo onziri ndezu zu.\n\n2. Mi nzu ongu,mi ande\n Ku,\nMi 'ba abala okposi;\nMi ma nzu asi tezasi,\nYesuni orodrifeni.\n\n3. Mi ma ovu candisi ku,\nMi ma asi ma oti ku;\nYesu ma leta deni ku,\nEri nga mi asi omi.\n\n4. Yesuni mi omve 'dani,\nMi ma mu vunia mbele;\nMi a'i Opi Yesuni,\nEri eco mi pazuni.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(180) Onward,Christian soldiers")){
                    String title = "Ongo(180) Onward,Christian soldiers";
                    String subtext = "1. Asikari Yesuni,ama ma enga;\nAma lu Yesu vu,ama nga aga.\nYesu Opi 'buari ama dri ceni,\nAma mu omba 'ba uri kokoru.\n\n    Asikari Yesuni,ama ma enga;\n    Ama ka Yesu lu,ama nga aga.\n\n2. Ati'ba Satanini yi nga apa dria;\nAma nga yi dro ra,ru Yesunisi.\nJuru amani dria ngani aga ku;\nYesu ma okposi ama yi nde ra.\n\n3. 'Ba dria Kanisani,yi mu drile ra,\n'Ba a'ipi ndra 'diyi ma pamvua;\nAma ti eci yibe ru Yesunisi,\nYesuni inziz asi alusi.\n\n4. 'Ba opiru nyakua yi nga yi de ra,\nTe Kanisani nga adri 'danini.\nAma nga Satanini aga Yesusi;\nE'yo Kristoniri sp pa 'dani ci.\n\n5. Asikari Yesuni,ama ma enga\nYesuni inzizu asi alusi;\nKristo Opi 'buari dizaru 'dani,\nAma mi inzi tu,malaika be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(181) Stand up,stand up for Jesus")){
                    String title = "Ongo(181) Stand up,stand up for Jesus";
                    String subtext = "1. Mi ma so pa Yesuni,\n  Mi so pa okporu;\nMi su bendera uru,\n  Drinza ma bi mi ku.\nYesuni 'ba dri ceni\n  Juru agazu dria;\nTe Yesuni nga angu\n  Nya opiru ada.\n\n2. Mi ma so pa Yesuni;\n  'Be omba cere 'bo!\nMi fu mu a'di 'dizu\n  Okpo Yesunisi.\nAma juru o'biru,\n  Satani opi yini;\nYesuni nga okpo fe\n  Drozu iriti ra.\n\n3. Mi ma so pa Yesuni,\n  Uri ma 'ye mi ku;\nOmbani nga i de ra,\n  Juru nga apa re.\n'Ba juru ndepi ra 'diyi\n  Nga orodri isu ra\nYi nga angu nya 'dani\n  Suru Yesunia!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(182) Sound the battle cry")){
                    String title = "Ongo(182) Sound the battle cry";
                    String subtext = "1. Ama 'be andru cere ombani,\nJuru inyia va 'doa ci;\nAma so pa ci Opi Yesusi,\nAma bi e'yo Munguni ci.\n\n    Ama enga,juru ovu inyia;\n    Ama so pa opi Yesusi,\n    Ama Opi Kristo ma ru inzi,\n    Opi amaniri Yesu'i.\n\n2. Okpo erini ama be indi,\nAma nga aga Yesusi;\nSu benderani ama drilia,\nAma nga aga vutinia.\n\n3. Mungu 'buari,mi ama eri,\nMi ama aza ko 'dani;\nOmba ka i de 'doa nyakua,\nAma nga ani pa so 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(183) There's a fight to be fought")){
                    String title = "Ongo(183) There's a fight to be fought";
                    String subtext = "1. A'di 'diza indi,ongu nzuza pie\n  Vini drani 'ba te geria;\nTe idri maniri,eri Opi Yesu,\n  Eri okpo maniri'i.\nEri agyi mani,'Ba ma Papiri'i,\n  Ma asi mani 'ba drinia;\nE,idri maniri eri Opi Yesu,\n  Eri okpo maniri'i.\n\n2. Leta erinisi,emu nyakua ra\n  Drazu pati alaza ruaa;\nCuru'do eri ovu Opiru 'bua,\n  Ede pari ma dri ngonde.\nMa nga di ongo ngo mani aciria,\n  Erini ma lele turisi;\nE, idri maniri eri Opi Yesu,\n  Eri okpo maniri'i.\n\n3. Eri nga ama ji okpo inirisi\n  Angu ndrizaru 'buaria;\nTe idri maniri eri Opi Yesu,\n  Eri okpo maniri'i.\n\n3. Eri nga ama ji okpo inirisi\n  Angu ndrizaru 'buaria;\nTe idri maniri eri Opi Yesu,\n  Eri okpo maniri'i.\nMa inzi runiri o'du mani dria,\n  Geri ka tro ewaru tu ti;\nE,idri maniri eri Opi Yesu,\n  Eri okpo maniri'i\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(184) Victory through grace")){
                    String title = "Ongo(184) Victory through grace";
                    String subtext = "1. Opi Yesu Kristo fe amani\n  Ari'ba agazuni;\n'Ba Munguni 'diyi ma dri cezu\n  A'di 'dizu okposi.\nYi asikari Yesuni,\n  Yi aga ari'ba dria;\nYi ru Yesuniri inzi,\n  Oyuzu ayikosi:\n\n    Opi Yesuni agaza feni\n    Asi ndriza inisi;\n    'Ba ma okpo funi dri ku,\n    'Ba aga lu Yesusi!\n\n2. Opi okpo turi fe amani\n  Ari'ba agazuni.\nOpi nde eri a'di'i yani?\n  Mungu 'ba Papiri'i!\nErini dri cele 'diyi\n  Nga ovu ngonile ya?\n'Ba nde yi 'ba ngapi dipi\n  'Bi'biole 'bua 'diyi.\n\n3. Opi opiniri fe amani\n  Ari'ba agazuni;\nOpi nyakua ka nga yi de ra,\n  Diza yini be dria,\n'Ba Yesuni yi dri cele\n  Onzi agazu ra 'diyi\nNga ca angu erini vu,\n  Ovuzu 'bua 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(185) The Lord's my Shepherd")){
                    String title = "Ongo(185) The Lord's my Shepherd";
                    String subtext = "1. Yehovani ma oceni,\n  Ma kabilo erini;\nFe ma la va nyamukoa,\n  Ji ma yi miliria.\n\n2. Mi idri o'diruri fe,\n  Mi vini ma dri ce\nKililiru,ru minisi,\n  Geri alaruria.\n\n3. Ma ka aci inisi ti,\n  Ma ngani ru 'de ku;\nMi ma be ci,ma ocezu\n  Kali minirisi.\n\n4. Mi nyaka ede ma dri ra\n  Ma juru ma milia;\nMi odu osu ma dria\n  Fe ma dri yi mvuza.\n\n5. Onyini nga ma vuti bi\n  Asi ndrizaru be;\nMa nga ovu 'dani 'dani\n  Yehova ma joa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(186) The King of love my Shepherd is")){
                    String title = "Ongo(186) The King of love my Shepherd is";
                    String subtext = "1. 'Ba ma Ocepiri eri\n  Opi asi ndrizani;\nMa kabilomva erini,\n  Eri ma oce 'dani.\n\n2. Eri ma dri ce etuzu\n  Yi miliri ma ma tia,\nFe nyaka 'buniri ma dri\n  Va nyamuko ibiria.\n\n3. Ma gbu ma kalaasi aka\n  Geri Yesuni kuzu;\nTe eri ndru ma alesi,\n  Ma omvizu akua.\n\n4. Ma 'yeni urisi 'de ku\n  E'bu drani alia;\nMi ovu vu inyia,\n  Asi mani omizu.\n\n5. Mi nyaka ede ma dri ra,\n  Mani di omu nyazu;\nMa ayiko isu 'dani\n  Mesa mini ma tia.\n\n6. Mi asi ndriza 'ba ma vu\n  Ewu manisi dria,\nMa nga ani mi ru inzi\n  Mi vile joa 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(187) Iam Jesus' little lamb")){
                    String title = "Ongo(187) Iam Jesus' little lamb";
                    String subtext = "1. Yesu ma agei te\nEtu dria cezu;\nYesu le ma ma avasi,\nEri ma omve rusi;\nEri ma dri okpo fe,\nAza koza be 'dani.\n\n2. Yesu ka ma dri ceni,\nMa aci,ma runi ku;\nEri nyaka nda ma dri,\nYi idrini fe indi;\nDro ma ari'ba 'dale,\n'Du ma i ma gbudria.\n\n3. Yes,mi ma oceni,\nMa 'do kabilo mini;\nMa le e'yo mini ni,\nMa le mi vuti bi ci;\nMi ce ma dri va 'doa,\nMa nga ca mi vu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(188) O GOd,our help")){
                    String title = "Ongo(188) O GOd,our help";
                    String subtext = "1. Mungu,mi kata amani\n  Ama ta mbazuri;\nAma econi ruzu ku,\n  Mi de ama be ci.\n\n2. Ndra 'ba alatararu 'diyi\n  A'i mi adaru;\nDri mini fudri yi dri ra,\n  Mi eco amasi.\n\n3. De wudrikuruni nga yo,\n  Mungu mi de ndra ci;\nMi Ata 'dani 'daniri\n  Engazu ndra drio.\n\n4. Eli alifu mi milia\n  Si o'du alule;\nEli nde aga ekile\n  Yi rapi rarile.\n\n5. Afa nyakuni 'diyi dria\n  Aga mbeleru ra;\nIdri ruani 'dinile,\n  Ovuni 'dani ku.\n\n6. Mungu,mi ko ama aza\n  Ecazu andru 'bo;\nAsi teza amaniri\n  Ovuzu mi be zu!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(189)")){
                    String title = "Ongo(189)";
                    String subtext = "1. Ma nga ma mile enga ra\n  Oni vualeru;\nE'yo ma aza kopiri\n  Ibi enga ngoa ya?\n\n2. E'yo ma aza kopiri\n  Enga Yehova vu;\n'Ba ndra 'bua pi,nyaku pie,\n  Afa dria pie.\n\n3. Ma pa kazu nzozu ku,\n  Yesuni ma dri ce;\nGeri ka tro ewaru ti,\n  Ma ngani ru 'de ku.\n\n4. Yehovani ma agei te\n  Etusi,inisi;\nYehovani ma dri a'bu\n  Endri inirisi.\n\n5. 'Ba ma agei Tepiri\n  Inisi ma be ci,\nTe eri koni o'du ku,\n  Mba ma ma ta 'dani.\n\n6. Eri nga onzi dria dro\n  Ma ageiarisi,\nNga idri mani ma ta mba\n  Ewule,ewule.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(190) A safe stronghold")){
                    String title = "Ongo(190) A safe stronghold";
                    String subtext = "1. Mungu,osu amaniri\n  Eri ama ma ta mbani;\nEri nga ama ari ra\n  E'yo onzi ma alia.\n    Te opi onziri\n    Enga ama ruaa\n    Ama 'yezu onzi;\n    Le ama dri ja ra,\nEri ma okpo amboru.\n\n2. Ama okpo econi ku,\n  Eri ama aga mbele.\n'Ba ama aza Kopiri\n  'Ba Munguni Peleri'i.\n    Eri a'di'i ya?\n    Eri Yesu Kristo\n    Mungu ma Mvaruri;\n    Eri a'dule nga\nSatani ma okpo nde ra.\n\n3. Orindi onzi yi ka tro\n  Ovu nyakua o'biru,\nAma asi otini ku;\n  Yi ngani ama aga ku.\n    Satani ma mile\n    Ka tro iniru ti,\n    Ama runi 'de ku;\n    Ama nga eri dro\nE'yo bari Yesunisi.\n\n4. Mungu ma e'yoni pa so,\n  E'yo nde nga i'ye mbele;\nSatani ka tro indi ti,\n  Munguni ama ta mbani.\n    Juru ka 'ba inza\n    Inzata ambosi,\n    Ka ama fu ra ti,\n    Koni yi aza ku;\nYesuni nga ama pani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(191) Tune:When Israel was in Egypt's land")){
                    String title = "Ongo(191) Tune:When Israel was in Egypt's land";
                    String subtext = "1. 'Ba Israelini 'diyi,\n  Mungu pa yini;\nAngu Misiriarisi,\n  Mungu pa yini.\n    Yesu Kristo 'Ba ama Papiri,\n    Eri ama pa onzi alia.\n\n2. 'Ba Israelini 'diyi,\n  Mungu pa yini;\nNdra ari'ba ma dria ra,\n  Mungu pa yini.\n\n3. Te Hezakia ngaresi\n  Mungu pa yi ra;\nSenakeribu ma dria,\n  Mungu pa yini.\n\n4. 'Be ndra Mesakani acia;\n  Mungu pa eri,\nAdripi erini pie;\n  Mungu pa yini.\n\n5. Danieli zi ndra Mungu ra;\n  Pa eri ani,\nFu kami gulearisi;\n  Mungu pa eri.\n\n6. O'be Pauloni onisi,\n  Mungu pa eri;\nYi'ba eri arujoa,\n  Mungu pa eri.\n\n7. Mi emu Yesu Kristo vu,\n  Eri nga mi pa;\nMi a'i Opi Yesuni,\n  Eri nga mi pa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(192) Like a river glorious")){
                    String title = "Ongo(192) Like a river glorious";
                    String subtext = "1. Mungu fe ama dri asi anzuru;\nFe asi anzuru nderi Yesusi.\nEri yi a'dile ama alia;\nEri ega 'dani ama asia.\n\n    Ama ka asi 'ba Yesu dria ra,\n    Eri asi anzu fe ama dri ra.\n\n2. Ama ka ama zi opilenia,\nCandi ngani ama nde aluni ku.\nAma pa soria Yesu vu inyia,\nAma nga di ovu asi anzu be.\n\n3. Mungu ka candi fe,kani ayiko,\nEri fe yi dria ale inisi;\n'Ba yi asi 'bapi drinia 'diyi\nNga asi anzuru isu etuzu.\n\n4. Yesuni ama be ama ta mbazu,\nEri Opi asi anzuniri'i;\nAmani eri ma vuti biria,\nAsi amaniri ngani oti ku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(193) Abide with me")){
                    String title = "Ongo(193) Abide with me";
                    String subtext = "1. Mi te ma be,etuni 'ye 'de 'di,\nAnguni bi bi,mi ovu ma be;\n'Ba ma aza kopini 'de yo fo,\nMi te ma be,mi fe ma dri okpo.\n\n2. Idri 'baniri 'ye i de mbele,\nAyiko nyakuniri afi ra,\nAfa dria oja yi ndu,ma ra;\nMi te ma be,'Ba ma Papiri la!\n\n3. Ma le mi tu o'du vusi dria,\nMi a'dule eco Satani nde;\n'Ba ma agei tepi mileni yo,\nMi te ma be e'yo dria alia.\n\n4. Mi ka ovu ma be,ma runi ku,\nMa candi aga dria misi ra;\nKa drani ti,ma ngani ru 'de ku,\nMi te ma be,ma nga aga misi.\n\n5. Mi omi ma asi dra ma alia,\nMi ece ma dri pata alaza;\nMani ovuria nga idri be,\nVini ma ka dra ra,mi te ma be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(194) O happy day")){
                    String title = "Ongo(194) O happy day";
                    String subtext = "1. Ma emu Yesu vuti bi,\nEri 'Ba ma Papiri'i;\nMa ayiko mani e'da,\nYesuni ma palerisi.\n\n    Ayiko mani ci,\n    Yesu oji onzi mani;\n    Eri imba ma a'izu,\n    Eri ce ma dri onyiru;\n    Ayiko mani ci,\n    Yesu oji onzi mani.\n\n2. Ma mu iriti Yesu vu,\nMa Yesuni,eri mani;\nMa kabilomva erini,\nYesuni ma oce 'dani.\n\n3. Ma emu,ngani ma dro\n  ku,\nMa ovu eri alia;\nTe eri indi ma alia,\nMa di e'yo erini 'ye.\n\n4. Ma aci ndra abazaru,\nTe Yesu 'ba ma kilili;\nMa nga eri ma vuti bi,\nE'yo erini 'yezu'i.\n\n5. Ma azi ndra ma Yesuni,\nMa ngani e'yo oja ku;\nTe kpere mani draria,\nMa nga ovu 'ba erini.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(195)")){
                    String title = "Ongo(195)";
                    String subtext = "1. Yesu dra pati alaza ma ruaa,\n  Erini ma lele turisi;\nOpi Yesuni ma dri ce etuzu,\n  Acizu geri iniria.\n\n    Acizu geria,\n    Acizu geri Yesunia;\n    Ma nga ovu ayikosi etuzu\n    Acizu geri Yesunia.\n\n2. Ma ngani adro azini inzi ku,\n  Ma lu Mungu adari inzi;\nOpi Yesuni ma dri ce etuzu,\n  Acizu geri iniria.\n\n3. Ma nga e'yo Munguni leleri 'ye,\n  Ma le azi Yesuniri nga;\nOpi Yesuni ma dri ce etuzu,\n  Acizu geri iniria.\n\n4. Ma le Yesuni ma asi driasi,\n  Erini ma pale rarisi;\nOpi Yesuni ma dri ce etuzu,\n  Acizu geri iniria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(196) When we walk with the Lord")){
                    String title = "Ongo(196) When we walk with the Lord";
                    String subtext = "1. Mi ka te Yesu be,\nBuku Munguni be,\nEringa mi ta mba etuzu.\n  Mi bi eri vuti,\n  Mi ei e'yoni;\nEri nga diza fe mi dri ra.\n\n    Mi ma a'i\n    E'yo Sizani dria;\n    Ayikoni nga ani\n    Ega mi ma asia.\n\n2. Iriti ka eca\nE'yo candiru be,\n  Eri nga yi dro ziri coti.\nMi asi funi ku,\nMi owuni 'de ku,\nMi ka e'yo Yesuni eri.\n3. Candi mini nyale\nYesu rusirisi,\nEri nga andesoni ofe.\nTeri mi ndepiri\nYesuni nga a'du,\nMi ka e'yoni eri 'dani.\n\n4. Mi aci eri be,\nMi ri palania,\nTi ecizu Yesu be 'dani.\nMi ma 'ye etuzu\nE'yo Yesuniri;\nMi 'ye urisi ku,mi a'i.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(197) O walk with Jesus")){
                    String title = "Ongo(197) O walk with Jesus";
                    String subtext = "1. Mi aci Yesu be andru,\nMi nga ale erini ni;\nMi ka aci ini alia,\nMi ngani aleni ni ku.\n\n2. Mi aci Yesu be andru,\nGeri erini kilili;\nGeri azini goliru,\n'Ba nga aba alenia.\n\n3. Mi aci Yesu be andru,\nEri nga mi dri ce 'dani;\nGeri ka ca ewaru ti,\nEri nga mi aza koni.\n\n4. Yesu,ma le aci mi be\nGeri miniria andru;\nMi esi ma vu inyia,\nAcizu ma be etuzu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(198) I heard the voice of Jesus say")){
                    String title = "Ongo(198) I heard the voice of Jesus say";
                    String subtext = "1. Yesu 'yo 'dini ma tia:\n  Mi emu ma vu fo,\nMa nga teri miniri 'du,\n  Mi nga ava li ra.\nMa mu vunia ani pi\n  Ezata mani be;\nFe ma dri ayiko ambo,\n  Ma ava li indi.\n\n2. Yesu 'yo 'dini ma tia:\n  Ma yi idriniri;\nYi avijo ka mi fu ra,\n  Mi emu ma vu fo!\nMa mu ani ri vu ra\n  Yi idrini mvuzu;\nTe yi avijo curu'do\n  Funi ma dika ku.\n\n3. Yesu 'yo 'dini ma tia:\n  Ma diza nyakuni;\n'Ba ma vuti bipi 'diyi\n  Aci diza alia.\nMa bi vutini,ma isu\n  Diza idriniri;\nMa nga di aci eri be\n  Kpere mani draria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(199) Where he leads me")){
                    String title = "Ongo(199) Where he leads me";
                    String subtext = "1. Ma eri e'yo Yesuni, (3)\nKini,Mi bi,mi bi ma vuti!\n\n2. Yesuni ma dri ce 'dani, (3)\nMa nga eri vuti bi indi.\n\n3. Candi ka tro ma isu ra, (3)\nMa nga Yesu vuti bi 'dani.\n\n4. Agyi mani ka ma ku ra, (3)\nMa nga Yesu vuti bi 'dani.\n\n5. Leta Yesuni aga ra, (3)\nMa nga eri vuti bi 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(200) O Jesus,I have promised")){
                    String title = "Ongo(200) O Jesus,I have promised";
                    String subtext = "1. Yesu,ma azi ndra ra\n  Mi vuti bizu zu;\nMi ovu ma be 'dani,\n  Yesu Opi mani.\nMa ngani omba ru ku\n  Mi ka ovu ma be;\nMa ngani geri kuku,\n  Mi ka ma dri ceni.\n\n2. Mi te ma be ogogo,\n  Nyaku ogogo tu;\nAfa nyakuni 'diyi\n  Yi ma obe saaru.\nE'yo onzi o'biru\n  Yi ma ageia ci;\nYesu,mi esi inyia\n  Ma pazu onzia.\n\n3. Yesu,'Ba ma Papiri,\n  Mi ce ma dri 'dani;\nMi 'yo ma tia,Opi,\n  Ma asi imbazu;\nMa le e'yo miniri\n  Erizu kilili,\nE'yo mani gazu si,\n  Miniri 'yezu'i.\n\n4. Yesu,mi azi ndra ra:\n  'Ba ka mi vuti bi,\nMi nga yi 'du'bua ra\n  Diza mini ndrezu.\nYesu,ma azi ndra ra\n  Mi vuti bizu zu;\nMi fe di ma dri okpo,\n  Agyi ma Lepiri!\n\n5. Mi fe mani acizu\n  'Dani mi pamvua;\nAsi 'baza maniri\n  Lu okpo miniri.\nMi ce ma dri drile fo,\n  Yesu,Oi mani,\nMa nga ca mi vu 'bua\n  Ovuzu mi be 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(201) Art thou weary?")){
                    String title = "Ongo(201) Art thou weary?";
                    String subtext = "1. Ma ande e'yo onzisi,\nEri ma omve;\nYesu 'yo ra,Mi emu ra\n  Ande li.\n\n2. Ma eco eri amazu\nA'di afasi?\nBile ci dri agelea\n  Pani be.\n\n3. Ekilaza suru nyazu,\nSu ndra drinia?\nE,su ndra oku onziri\n  Ocini.\n\n4. Ma ka eri ma vuti bi\nMa a'di isu?\nMi isu e'yo ewaru\n  Candi be.\n\n5. Ma ka aci eri be ra,\nEri a'di fe?\nEngatasi mi nga ani\n  Dra aga.\n\n6. Ma ka matu 'ba vunia,\nEri eri ra?\nEri ngani e'yo mini\n  Ga si ku.\n\n7. Yesu,ma emu mi vu ra,\nMi a'i ma fo;\nMa 'ba onzi,te ma le mi\n  Dro ma ku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(202)")){
                    String title = "Ongo(202)";
                    String subtext = "1. Yesu,ma mu andru mi\n  vu\n  Ovuzu mi ati'bo;\nNdra ma ovu avizaru,\n  Ale mini pa ma ra.\n\n    Ma le fe,fe mi dri,\n    Ma le ma fe pi mi\n      di!\n\n2. Opi Yesu,idri mani\n  Ma le dria fe mi dri;\nMi ma ko ma aza 'dani\n  Mi inzizu kilili.\n\n3. Opi Yesu,ma fe andru\n  Afa mani,sente be,\nRua mani pie dria;\n  Ma yi fe andru mi\n    dri.\n\n4. Opi Yesu,ale mani\n  Ma fe andru okpo be\nAsi mani ma fe indi,\n  Ma le azi mini nga.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(203) Take my life")){
                    String title = "Ongo(203) Take my life";
                    String subtext = "1. Ma fe ma idri mi dri,\nOpi mani Yesu la!\nO'du mani etu dria,\nMa fe mi dri a'dule.\n\n2. Ma dri ma ovu mini,\nAzi ngazu avasi;\nPa mani,ma fe indi,\nAcizu mi vutisi.\n\n3. Ma o'duko mani fe\nOngo ngozu mi dri fo;\nMi 'du tile maniri\nRu miniri inzizu.\n\n4. Mi 'du afa mani dria,\nSilingi mani pie;\nAsisile maniri,\nOkpo mani be dria.\n\n5. O'du acepi 'diyi,\nMi fe ma eza yi ku;\nMa le azi mini nga\nEwu mani driasi.\n\n6. Mi azita ma le ra,\nYi ewaru ma dri ku.\nMi 'du asi maniri,\nMi dro onzi dria re.\n\n7. Mi 'du ava maniri,\nMa ma le mi avasi;\nMa le ovu etuzu\n'Ba mi vuti bipiri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(204) Lead me to calvary")){
                    String title = "Ongo(204) Lead me to calvary";
                    String subtext = "1. Opi Yesu,mi ese ma,\n  Asi mani alia,\nAcizu mi be etu dria,\n  Kalvari luzu'i.\n\n    Mi e'da Getesemane,\n    Mi e'da mani\n      Kalvari;\n    Ale mini aga dria,\n    Kalvariari'i.\n\n2. Geri miniri,ma ka ku,\n  Ma ka avi misi,\nMi ma ese ma letasi\n  Kalvari luzu'i.\n\n3. Oku mi vuti bipi 'diyi\n  Ndre ndra pati mini;\nMi zi ma mile indi fo,\n  Kalvari luzu'i.\n\n4. Opi Yesu,ma fe mi dri\n  Idri maniri dria,\nMi vuti bizu etuzu,\n  Kalvari luzu'i.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(205)")){
                    String title = "Ongo(205)";
                    String subtext = "Mi nga azi Munguni,\n  Mi nga etuzu;\nMi ku e'yo Yesuni,\n  Mi nze e'yo ndu.\nMi ji e'yo 'ba dria vu,\n  E'yo idriniri;\nMi e'da ru Kristoni,\n  Ru aluzaru.\n\n2. Mi nga azi Munguni\n  Asi driasi;\nAzi Munguni 'diri:\n  Yesu a'izu.\nMungu pe eri ti ndra\n  'Ba dria opazu;\nMi ma a'i Yesuni!\n  Eri nga mi pa.\n\n3. Mi nga azi Munguni,\n  Azi onyiru;\nMi ece asi ndriza\n  'Ba vu dria fo.\nMungu leta be turi\n  Nga mi dri ce zu zu,\nNga vini mi ta mba ra\n  Letasi 'dani.\n\n4. Mi nga azi Munguni,\n  'Ba aza kozu;\nMi 'ye kile Yesuni\n  Ndra 'yelerile.\nYesu mu 'ba imbazu\n  Yi rua atizu.\nYi ma asi omizu;\n  Mi bi pamvuni.\n\n5. Mi nga azi Munguni\n  Asi driasi\nYesuni nga okpo fe\n  Mi dri fudri ci.\nAzi nde ka i de ra,\n  Eri nga mi a'i\nOvuzu i be 'bua\n  Ewule 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(206) Who is on the Lord's side")){
                    String title = "Ongo(206) Who is on the Lord's side";
                    String subtext = "1. A'di te Yesu be,eriniriru\nA'dini nga azi Yesuniri nga?\nA'dini nga nyaku ku Yesusi ya?\n'Ba Yesu lepiri eri a'di'i?\n\n  Yesu,mini ama palenirisi,\n  Ama le di pa so miniru 'dani!\n\n2. Ama leni oya,inzita be ku;\nAma mi vuti bi ceni avasi.\nMi dra pati ruaa 'ba opazu ra;\nAma di ama fe mi dri alesi.\n\n3. Yesu,mi je ama ari minisi;\nMi wu ama onzi,asi ndrizasi.\n'Ba yi asi 'bapi mi ma dria 'diyi,\n'Ba nde drilebaru;Yi mi vuti bi.\n\n4. Satani okporu,'di a'di 'ba be;\nAma asikari Yesuni 'diyi,\nAma nga omba 'ba,Yesu ma rusi;\nEri ma okposi ama nga aga.\n\n5.Yesu,mi pe ama asikariru;\nAma a'di 'di ra,asi driasi,\nAma azi nga ra,asi adasi,\nPa sozu miniru asikokoru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(207) He leadth me")){
                    String title = "Ongo(207) He leadth me";
                    String subtext = "1. Yesu,mi ma dri ce mi'i,\nMa asi 'bazu anzuru;\nPari dria ma alia,\nYesu,mi ma dri ce 'dani.\n\n    Yesu,ma le mi ce ma dri,\n    Mi bi ma dri mi drisi fo;\n    Ma le mi vuti bi 'dani,\n    Mini ma dri celerisi.\n\n2. Angu ka bi inicici,\nAngu ka mve mve dria ti,\nAyiko kani candi ti,\nYesu,mi ce ma dri 'dani.\n\n3. Opi,ma le mi bi ma dria,\nMa leni ma gbu kalaa ku;\nAsi anzuru mani ci,\nMini ma dri celerisi.\n\n4. Azi mani ka i de ra,\nMa ka e'yo aga dria,\nYesu,ma ngani dra ru ku,\nMini ma dri celerisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(208) Jesus,still lead on")){
                    String title = "Ongo(208) Jesus,still lead on";
                    String subtext = "1. Mi ce ama dri\n  Geri minia;\nYesu,ama nga ca 'bua,\nAma ka mi vuti bi'i;\n  Mi ce ama dri\n  Cazu mi vu fo.\n\n2. Geri ka onzi,\n  Ka candiru ti,\nMi dro uri ama asia,\nMi fe asi teza 'dani;\n  Ama ma te mi,\n  'Ba 'ba Papiri.\n\n3. Ama ka mi ndru,\n  Obeta ka ci,\nJuru ka le ama dri ja,\nMi fe a'ita ama dri,\n  Mi 'ba mi mile\n  Ama luzu fo.\n\n4. Mi ini onzi\n  Amaniri dria;\nMi ko ama aza 'dani,\nMi ece geri amadri,\n  De nga ama ndre\n  Mi ma mile ku.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(209) Near to thee")){
                    String title = "Ongo(209) Near to thee";
                    String subtext = "1. Yesu,'Ba ma dri cepiri,\n  Angu dria etuzu,\nOpi la,ma zi mi tia,\n  Mi esi ma vu inyia.\n\n    Opi Yesu Kristo la,\nMi esi ma vu inyia\n  (x2)\n\n2. Angu ka bi ma ageia,\n  Ayiko ka ovu yo,\nMa le mi ma mile ndre ra;\n  Mi esi ma vu inyia.\n\n3. Yesu,asi teza mani\n  Diza mani etu dria,\nCandi ka ma bi amboru\n  Mi esi ma vu inyia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(210) Guide me,O thou great Jehovah")){
                    String title = "Ongo(210) Guide me,O thou great Jehovah";
                    String subtext = "1. Mi ce ma dri,'Ba Papiri,\n  Acizu roko dria;\nMa ovu okpo kokoru,\n  Te mi okpo ma E'i;\n    Mi fe ma dri (2)\nEnya 'buari nyazu. (2)\n\n2. Mi fe yi a'di alaru\n  Ma egbi oni ruaa;\nMi fe iriti aci be\n  Ma dri cezu etuzu;\n    'Ba Papiri, (2)\nMi ce ma dri 'dani fo. (2)\n\n3. Ma ka ca Yi Ara tia,\n  Mi dro uri ma asia;\nMi fe ma zo Yoridani\n  Cazu Kanania 'daa.\n    Mi inzizu, (2)\nMa nga ongo ngo 'dani (2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(211) Lead us,Heavenly Father,lead us")){
                    String title = "Ongo(211) Lead us,Heavenly Father,lead us";
                    String subtext = "1. Ata 'buari,ma le mi\n  Mba ma ta va\n    Nyakua;\n'Ba azini ma dri cezu\n  Mileri aluni yo;\nDrileba mi be adaru,\n  Mungu Ata 'buari.\n\n2. Yesu,mi fe okpo ma dri,\n  De Satani obe ma;\nMi aci ndra roko dria,\n  Eri obe ndra mi ti;\n'Ba ama icipiri ci,\n  Te mi aga eri ra.\n\n3. Orindi Alatararu,\n  Mi ga ma asia tre;\nMi fe ayiko miniri,\n  Leta avasiri be;\n'Dini,Mungu mani,misi\n  Ma nga aci kilili.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(212) My faith looks up to thee")){
                    String title = "Ongo(212) My faith looks up to thee";
                    String subtext = "1. Ma mile 'ba mi vu,\nMi 'Ba 'ba Papiri,\n  Yesu Kristo;\nMani mi ziria,\nMi wu onzi mani;\nMa le ovu mini\n  'Dani 'dani.\n\n2. Asi ndriza mini\nMa fe okpo ma dri,\n  Ava be fo;\nMi dra pati ruaa\nAle ma e'yosi,\nMi fe ava mini\n  Ma va ma tu.\n\n3. Mani aciria\nNyakua candisi,\n  Mi ce ma dri;\nMi'i angu ma dri,\nMi li mindre mani,\nMi fe ma te mi be\n  'Dani 'dani.\n\n4. Idrini furia,\nDrani ecaria,\n  Mi ku ma ku;\n'Ba ma Papiri mi,\nMi dro uri mani,\nMi ji ma orindi\n  Mi vu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(213) Nearer,my God,to thee")){
                    String title = "Ongo(213) Nearer,my God,to thee";
                    String subtext = "1. Mungu,mi vu inyia,\n  Mungu mani;\nCandi ka ma isu,\n  E'yoni yo;\nOngo maniri 'di:\nMungu,mi vu inyia,\nMungu,mi vu inyia,\n  Mungu mani.\n\n2. Mani aciria,\n  Etu 'de ra;\nMa di Yakobole,\n  Ma nga la va;\nOrobi ma alia\nMa le ovu 'dani\nMungu,mi vu inyia,\n  Mungu mani.\n\n3. Mi gerini e'da\n  'Bani tuzu,\nMuzu uru 'bua\n  Mi ndrezuri;\nMi fe malaika\nMa omvezu mi vu,\nMungu,mi vu inyia,\n  Mungu mani.\n\n4. Ma nga ovu ani\n  Ayikosi,\nMa nga miru inzi\n  Asi basi;\nMa ka candi nya ti,\nMa candini ma ji\nMungu,mi vu inyia,\n  Mungu mani.\n\n5. Mani aciria,\n  Mi mba ma ta;\nMa asi anzuru\n  Mi e'yosi;\nVilerisi ma nga\nCa mi vu 'bua ra,\nMungu,mi vu inyia,\n  Mung mani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(214) Thy way,not mine,O Lord")){
                    String title = "Ongo(214) Thy way,not mine,O Lord";
                    String subtext = "1. Mungu,ma le aci\n  Geri miniria;\nKa tro ewaru ti,\n  Mi pe geri ma dri.\n\n2. Ma peni geri ku\n  Ondua manisi;\nMi pe geri mani\n  Acizuri mi'i.\n\n3. Mi ka candi fe ti,\n  Kani ayikoni,\nMini lelerile;\n  Mini peleri ba.\n\n4. Mi ka azo fe ra,\n  Ka ruaa alaru,\nTe ti,ma nga aci\n  Geri miniria.\n\n5. Mi pe agyi mani,\n  Azi maniri be;\nMi pe ma dri pari\n  Mani ovuzuri.\n\n6. Mi pe e'yo ma dri\n  De ma nyakua ci;\nMi ce ma dri 'dani,\n  Mani cazu 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(215) Tune: O Freedom")){
                    String title = "Ongo(215) Tune: O Freedom";
                    String subtext = "1. Driwala,driwala,\nDriwala adaru,\nDriwala adaruri\nYesu fe ama dri ra;\nDriwala Yesu fe ama dri.\n\n2. Driceza,driceza,\nDriceza onyiru,\nDriceza onyiruri\nYesu fe ama dri ra;\nDriceza Yesu fe ma dri.\n\n3. Drileba,drileba\nDrileba adaru,\nDrileba adaruri\nYesu fe ama dri ra;\nDrileba Yesu fe ama dri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(216) O for a heart to praise my God")){
                    String title = "Ongo(216) O for a heart to praise my God";
                    String subtext = "1. E,Yesu mani leleri,\n  Mi fe andru ma dri\nAsi alatararuri'i,\n  Ru mini inzizu.\n\n2. Mi fe ma asi ma eri\n  Azita 'yezu dria;\nOpi,mi ri ma asia,\n  Ma dri cezu 'dani.\n\n3. Mi 'ba ma asi alaru\n  Ari minirisi;\nEri ma ovu nditiri\n  Asi minirile.\n\n4. Ma le afu onzi ku ja\n  Ma asi alia;\nMa le ovu e'yereru,\n  Asi anzuru be.\n\n5. Mi fe egata o'diru,\n  Alaru,onyiru,\nOsuza 'yeke onyi be\n  Ma ga ma asia.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(217) Come,thou Fount")){
                    String title = "Ongo(217) Come,thou Fount";
                    String subtext = "1. Yi a'di asi ndrizani,\n  Yesu,mi ma ati ma;\nYi ara rapi 'daniri\n  Ma era ma asia.\nMi imba ma mi inzizu\n  Asi ndriza minisi;\nMa ongo ngo mi dri\n  'dani;\nMini ma lelerisi.\n\n2. Ma nga aci kililiru,\n  Mini ma dri ceria;\nMi ka ma dri ce acizu;\n  Ma nga ca mi vu 'bua.\nMi emu andra ma\n ndruzu\n  De ndra ma aci saaru;\nMa pazu e'yo onzisi\n  Mi ecandi ndra mi tu.\n\n3. Asi ndriza mini ma vu,\n  Ma e'yoni ega ti;\nMi fe asi ndriza nderi\n  Ma ombe ma mi vu ci.\nMi fe ma ma aci mi be,\n  Ma ma ku mi ku beni;\nMi ce ma dri mi okposi\n  Acizu kililiru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(218)")){
                    String title = "Ongo(218)";
                    String subtext = "1. Arimoni Yesu Kristo,\n  Mi ovu ma be 'dani,\nMani e'yo dria 'yezu\n  Asi ndriza minisi.\nE'yo Yesuni ma ovu\n  Ma asi ma alia,\nMani onzi dria ndezu\nOkpo erinirisi.\n\n2. Asi Yesuni anzuru\nMa dri ce o'du vusi;\nMa awa'difo fe ani\n  Mungu mani dri\n    'dani.\nAsi mani ma ga tre ra\n  Ale Yesunirisi,\nMani 'ba azini lezu\n  Ava erinirisi.\n\n3. Asi ndriza Yesuniri\n  Ma ga ma asia tre,\n'Ba ma ndre ani Yesuni\n  Adriza maniria.\nAsisile Yesuniri\n  Ma ovu ma asia,\nMani e'yo dria 'yezu\n  Diza fezu Mungu dri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(219) Gentle Jesus")){
                    String title = "Ongo(219) Gentle Jesus";
                    String subtext = "1. Yesu,ale minisi\nMi lu ma vu,mva mini;\nMi ma ko ma aza fo,\nMa le mu mi vu ada.\n\n2. Kabilomva Munguni,\nMi oga ma andru ku;\nSuru mini ma alia\nMi fe pari ma dri fo.\n\n3.Yesu,mi Mva Munguni,\nMa lu mi vu etuzu;\nMi 'ba ma onyiru fo,\nMa le ovuzu mile.\n\n4. Mi 'Ba alatararu,\nMi 'ba ma alaru fo;\nAle mini mi ma 'ba\nAsi mani ma alia.\n\n5. Mi imba mani e'yo\nOnyiruri 'yezu'i,\nMa ma 'ye ani zu zu\nMini ndra 'yelerile.\n\n6. Yesu,'Ba ma Lepiri,\nMi ovu ma asia;\nYesu,'Ba 'ba Papiri,\nMa le ru mini inzi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(220) Jesus bids us shine")){
                    String title = "Ongo(220) Jesus bids us shine";
                    String subtext = "1. Yesu 'yo kini ama talani,\nAma ma di angu biza alia;\nNyaku 'dori onzi,iniciciru.\nAma ma 'i angu Yesu rusi.\n\n2. Yesu 'yo kini ama dizani\nAngu 'izu 'ba dria ma milia;\nEri le diza amani ndrezu ra.\nAma ma 'i angu Yesu rusi.\n\n3. Yesu le etuzu ama ma 'ye\nE'yo Munguni leleri a'dule;\nAma ecetaru 'ba ma milia.\nAma ma 'i angu Yesu rusi.\n\n4. Eri okpo fe ama dri dria\nAdrizu alatararu etuzu,\nE'yo onyiruri 'yezu avasi.\nAma ma 'i angu Yesu rusi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(221) I lay my sins on Jesus")){
                    String title = "Ongo(221) I lay my sins on Jesus";
                    String subtext = "1. Ma 'ba ezata mani\n  Mvi Munguni ma\n    Dria;\nYesu 'du teri mani\n  Rua iniria.\nMa 'ba ezapi turi,\n  Ma emu Yesu vu;\nEri ma 'ba alaru\n  Ari inirisi.\n\n2. E'yo mani leleri\n  Yesu fe ma drini.\nMa ovu 'ba azoru,\n  Yesu ati mani.\nAsi otiza mani.\n  Yesu ni dria ra;\nMa asini ambi ra\n  Ru erinirisi.\n\n3. Yesu Opi amani,\n  Yesuni 'ba opa;\nRu erini aga ra,\n  Aluzaru nde ra.\nRuniri ayiko fe\n  'Ba asia ada;\nGeri 'ba pazuni yo\n  Pe lu Yesu rusi.\n\n4. Ma le ovu Yesule,\n  Asi e'yere be;\nMa le ovu alaru\n  Mva Mungunirile.\nMa le ovu Yesu be,\n  'Ba 'bua 'diyi be,\nRu erini inzizu\n  Ewule ewule.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(222) Lord,I want to be a Christian")){
                    String title = "Ongo(222) Lord,I want to be a Christian";
                    String subtext = "1. Ma le ovu 'ba Kristoni\n  Ma asia,ma asia;\nMa le ovu 'ba Kristoni\n  Ma asia.\n\n    Ma asia,(ma asia) (2)\n    Ma le ovu 'ba Kristoni\n    Ma asia.\n\n2. Ma le ovu 'ba leta be--\n\n3. Ma le ovu 'ba alaru--\n\n4. Ma le ovu 'ba adaru--\n\n5. Ma le ovu 'ba Yesuni--\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(223) Yield not to temptation")){
                    String title = "Ongo(223) Yield not to temptation";
                    String subtext = "1. Obeta ka indi,mi ga eri si,\nMi so pa ci 'dani,mi nde onzi dria;\nA'di onzi indi,te Yesu indi;\nMi ka Yesu lu ra,eri nga mi pa.\n\nOpi agapi turi\nNga ovu mi be 'dani;\nEri ngani mi ku ku,\nEri nga mi ta mba.\n\n2. 'Ba onzi 'diyisi mi ma ona mi,\nMi 'yo e'yo 'yoza alaruri'i;\nMi ovu e'yere,leta be indi;\nMi ka Yesu lu ra,eri nga mi pa.\n\n3. 'Ba agapi ra 'diyi nga oku su,\nYi nga ri va 'bua Yesu be 'dani;\n'Ba ama Papiri nga okpo fe ra;\nMi ka Yesu lu ra,eri nga mi pa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(224) Look to the Lambo of God")){
                    String title = "Ongo(224) Look to the Lambo of God";
                    String subtext = "1. Mi ka le ovu pazaru ada,\n  Mi lu Kabilomva;\nYesu ari ra pati ruaa ra\n  Ezata minisi.\n\n    Mi lu Kabilomva,\n    Kabilomva Munguni;\n    Yesuni lu mi pani a'dule,\n    Mi lu Kabilomva.\n\n2. Satani ka mi o'bi okposi,\n  Mi lu Kabilomva;\nMi e'yo onzi aga ra ada\n  Yesu ma okposi.\n\n3. Mi ka ande ra azi ndu ndusi,\n  Mi lu Kabilomva;\nEri fe mini ava lizu ra\n  Asi anzurusi.\n\n4. E'yo ewaru ka eca mi vu,\n  Mi lu Kabilomva;\nYesu eco mi aza kozuni,\n  Yiki inirisi.\n\n5. Yesuni Opi nde 'buari'i,\n  Mi lu Kabilomva;\nAga opi azini dria ra\n  Okposi,dizasi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(225) Tune:It's me,O lord")){
                    String title = "Ongo(225) Tune:It's me,O lord";
                    String subtext = "    Yesu,Opi mani,\n    Mi emu ma aza ko;\n    (x2)\n\n1. Obeta eca ma vu,Yesu la;\nMi emu ma aza ko.\n(x2)\n\n2. Ma candi ma alia,Yesu la;\nMi emu ma aza ko.\n(x2)\n\n3. Ma ovu andezaru,Yesu la;\nMi emu ma aza ko.\n(x2)\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(226) I need thee every hour")){
                    String title = "Ongo(226) I need thee every hour";
                    String subtext = "1. Ma le mi te ma be,\n  Opi Yesu\nO'du vusi dria\n  Mi te ma be.\n\n    Ma le mi,Opi\n      Yesu,\n    Tezu ma be 'dani;\n    Mi ko ma aza okpo\n    Minirisi.\n\n2. Ma le mi te ma be,\n  Opi Yesu;\nMi fe ma dri okpo\n  Onzi ndezu.\n\n3. Ma le mi te ma be,\n  Opi Yesu;\nMi omi ma asi\n  Candi alia.\n\n4. Ma le mi te ma be,\n  Opi Yesu;\nMi imba ma e'yo\n  Minirisi.\n\n5. Ma le mi te ma be,\n  Opi Yesu;\nMi 'ba ma adaru\n  'Ba miniru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(227) Tune:O by and by")){
                    String title = "Ongo(227) Tune:O by and by";
                    String subtext = "    Yesu Kristo alia\n    'Ba dria yi ovu o'diru;\n    Yesu Kristo alia\n    E'yo drio 'diyi aga 'bo.\n\n1. Ma econi 'ba ngu onzi ku;\nE'yo drio 'diyi aga 'bo.\nMungu 'ba leta asi mania;\nYesu ma alia ma o'diru.\n\n2. Ma leni ewa mvu dika ku;\nE'yo drio 'diyi aga 'bo.\nOrindi ma ga ma asia tre;\nYesu alia ma o'diru.\n\n3. Ma leni ongo tu dika ku;\nE'yo drio 'diyi aga 'bo.\nMa nga ongo Munguni 'diyi ngo;\nYesu ma alia ma o'diru.\n\n(Agupi)\n4. Ma leni oku azini ku;\nE'yo drio 'diyi aga 'bo.\nMa le oku mani aluri'i\nYesu alia ma o'diru.\n\n(oku)\n5. Ma ngani ma agupi ku ku;\nE'yo drio 'diyi aga 'bo.\nMa le ma agupi aluri'i;\nYesu alia ma o'diru.\n\n6. Uri dra ruzuri de i 'bo;\nE'yo drio 'diyi aga 'bo.\nMa nga tu uru Yesu vu 'bua;\nYesu alia ma o'diru.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(228)")){
                    String title = "Ongo(228)";
                    String subtext = "1. 'Ba Kristoni adaru 'diyi\n  Yi Yesu vuti bi,\nYi lezu yi eselia\n  Ale Yesunisi.\n\n2. 'Ba Kristoni adaru 'diyi\n  Ari Yesuniri\nYi asi oji nditiri,\n  Yini onzi kuzu.\n\n3. 'Ba Kristoni adaru 'diyi\n  Lini inzo 'de ku;\n'Ba nde econi 'ba o'da\n  Geri onzisi ku.\n\n4. 'Ba Kristoni adaru 'diyi\n  Yi adri alaru;\nYi asisile dro 'dani\n  E'yo alaru dria.\n\n5. 'Ba Kristoni adaru 'diyi,\n  Yi ma asi ga tre\nAle Yesu Kristonisi;\n  Yi le ani 'ba tu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(229) The night is far advanced")){
                    String title = "Ongo(229) The night is far advanced";
                    String subtext = "1. Ini aga di 'bo,\n  Anguni ati ra;\nKa'dini ama ku 'yeta\n  Angu bizaniri.\n\n2. E'yo ada suzu\n  A'di 'dizu ani;\nOvuzu alatararu,\n  Acizu kilili.\n\n3. Ezata amani\n  Ama ku dria ja,\nAfu nyakuniri pie,\n  Ewa mvuzuri be.\n\n4. Le ama ma aci\n  Diza ma alia;\nAma ma le 'ba avasi.\n  Leta Yesunisi.\n\n5. Ini aga di 'bo,\n  Yesuni dizani;\nAma bi eri vuti'i,\n  'Ba ama Papiri.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(230) I'm a little pilgrim")){
                    String title = "Ongo(230) I'm a little pilgrim";
                    String subtext = "1. Ma 'ba acipiri\n  Andru nyakua;\nE'yo kakau 'diyi\n  Yi ma obe ra.\n\n2. Angu ndri 'bua ndri,\n  Onzi 'dale yo;\nE'yo cadiru 'diyi\n  Cani 'dale ku.\n\n3. Anzi lepi fipi\n  Angu ndea 'diyi,\nYi ma a'i Yesu\n  Yi ma asia.\n\n4. 'Ba acipi geri\n  Yesuniari\nMa zi Yesu tia\n  I ma dri cezu.\n\n5. Yesu,ma mi a'i\n  Asi mania;\nMi wu onzi mani\n  Asi ndrizasi.\n\n6. Yesu,mi otu ma\n  Mi imbatasi;\nMi ce ma dri muzu\n  Mi vualeru.\n\n7. Ma 'ba acipiri\n  Andru nyakua;\nTe aku maniri\n  Ovu 'bua ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(231) Higher ground")){
                    String title = "Ongo(231) Higher ground";
                    String subtext = "1. Ma le tu angu ngurua,\nYesu,ma le ovu mi be;\nMa nga aci a'itasi,\nMi ce ma dri uru mi vu!\n\n    Mi 'du ma uru mi vu fo!\n    Ma le ovu angu 'bua,\n    Pari agapi turia;\n    Mi 'du ma uru mi vu fo!\n\n2. Ma leni ovu 'doa ku,\nSatanini ma obe tu;\n'Ba nyaku 'dori lepiri\nMa ovu ini 'doani.\n\n3. Ma le onzi ma nde ma ku,\nMa le obeta aga ra;\n'Ba ka osi o'diru ra,\n'Ba nde aga a'itasi.\n\n4. Ma le ca 'dale 'bua ra,\nLe diza Munguniri ndre;\nYesu,ma le mi mile ndre\nAsi ndriza minirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(232) There is a better world")){
                    String title = "Ongo(232) There is a better world";
                    String subtext = "1. Angu ndriza agapiri\n  Opi vu 'bua ci;\nOnzi 'dale aluni yo,\n  Angu nde alia.\nMalaika yi ongo ngo\nMungu inzuzu o'disi;\nJo onyi be pie dria\n  Opi vu 'bua ci.\n\n2. Angu biza 'dale 'de yo,\n  Angu nde alia;\nMindre azini candi yo,\n  Angu nde alia.\n'Ba yi idriniri mvu'i;\nYi ka 'Ba 'ba Papiri ndre,\nYesuni etu yiniru\n  Angu nde alia.\n\n3. Anyapa,afa onzi be\n  Ngani fi 'dale ku;\nOnzi azini drata be\n  Ngani fi 'dale ku.\n'Ba 'dale 'diyi alaru,\nYi oji onzi yini 'bo;\n'Ba ovupi onzi be 'diyi\n  Ngani fi 'dale ku.\n\n4. Ama ka tro onzi be ti,\n  Yesu dra amasi;\nMari amani ofezu,\n  Yesu dra amasi.\nAma nga adri eri be\nAku 'buari alia,\nEri inzuzu etuzu,\n  'Ba ama Papiri.\n\n5. 'Ba dria ma emu mbele,\n  Ama mu Opi vu;\nE'yo 'doari i de ra,\n  Ama mu Opi vu.\nAma te 'ba azini ku,\nAma ma ku e'yo onzi\nAfa nyakua 'diyi be;\n  Ama mu Opi vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(233) There is a happy land")){
                    String title = "Ongo(233) There is a happy land";
                    String subtext = "1. Angu ayikoni\n  'Bua 'dale;\n'Ba yi pa so 'dale\n  Opi milia.\nYi ongo ngo 'dani\nRu erini inzuzu;\n'Ba 'ba Papiri ci,\n  Opi Yesu.\n\n2. Emi ma mu 'dale,\n  Emi ma mu.\nAma angu 'doa\n  A'di te ya?\nE'yo yi candiru\nRua suza be indi;\n'Dale 'ba nga ovu\n  Ayikosi.\n\n3. Mindre 'ba milia\n  'Dale 'de yo;\nLeta Ataniri\n  Deni i ku.\nEmi bi gerini\nCazu 'bua ururi;\nYesu le mi a'i\n  Uru 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(234) There is no night in heaven")){
                    String title = "Ongo(234) There is no night in heaven";
                    String subtext = "1. Angu 'dale 'buari,\nIni 'daleni yo;\n'Ba andeni azisi ku,\nYi azi nga letasi.\n\n2. 'Bua 'dale candi yo,\nAyiko 'dale tu;\nTe Opini mindre ini\n'Ba dria ma milia.\n\n3. 'Bua e'yo onzi yo;\n'Ba capi 'dale 'diyi\nSu bongo alatararu,\nYi Yesu dri ongo ngo.\n\n4. 'Bua 'dale drata yo;\n'Bua fipi 'dale 'diyi\nYi bi pata yini ada,\nPata depi kuri'i.\n\n5. Yesu e'yo Lipiri,\nMi fe ama ma lu\nE'yo driasi mi vu fo,\nCazu ani mi vu 'daa.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(235) A few more years shall roll")){
                    String title = "Ongo(235) A few more years shall roll";
                    String subtext = "1. Eli ace were\nEwuni nga asi;\nAma nga idri 'diri ku,\nOvuzu 'doa yo.\nYesu,mi pa ama\nEzata alia;\n\n    Mi oji ama hwilili\n    Ari minirisi.\n\n2. Ewu ka nga asi,\nEtu ma diza yo,\nAma nga mu angu 'bua\nNdrizaru turia.\nYesu,mi dizani,\nAma le ca mi vu;\n\n3.Dra ngani ovu ku,\nAzini candi yo;\nAma ngani azo pi ndre\n  Mindre be dria ku.\n  Yesu,a le mi ndre\n  Angu 'buaria;\n\n4. Ace o'du were\nYesuni 'ye eca;\nEri emvi ama 'duzu,\nJizu 'bua 'dale.\nOpi,ama le mi\nMa emu ama vu;\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(236) Tune:I want to be ready")){
                    String title = "Ongo(236) Tune:I want to be ready";
                    String subtext = "Ma le ovu ngonde, (3)\nAdrizu 'bua Opi Yesu be.\n\n1. Ma eri Yesu ma o'duko,\nMa le ovu 'bua Yesu be;\nYesuni ma omve i vu,\nMa le ovu 'bua Yesu be.\n\n2. Yesu dra pati ruaa masi,\nMa le ovu 'bua Yesu be;\nEri ma ari oji ma,\nMa le ovu 'bua Yesu be.\n\n3. Ma fe idri mani Yesu dri,\nMa le ovu 'bua Yesu be;\nMa nga eri ma vuti bi,\nMa le ovu 'bua Yesu be.\n\n4. Yesu pa ma asi ndrizasi,\nMa le ovu 'bua Yesu be;\nEri ede pari ma dri,\nMa le ovu 'bua Yesu be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(237)")){
                    String title = "Ongo(237)";
                    String subtext = "1. Ama aku onyi beri ndre\nA'ita ma milesi ada;\nYesu tu b'ua pari ede,\nLe amani ovuzu i be.\n\n    Ewu droziria\n    Ama nga ama ndre Yesu be.\n    (x2)\n\n2. Ama nga 'dale ongo ngo'i\nYesu Kristo ma ru inzuzu;\nCandi mindre be 'dale 'de yo,\nAma nga ovu ayikosi.\n\n3. Kabilomva ndre yini lile\nE'yo onzi 'banisiri'i,\nAma nga eri inzu 'bua;\nRunir aga ru dria ra.\n\n4. Ama nga di awa'difo 'yo\nMungu vu o'du vusi dria,\nYesuni ama lelerisi,\nAma pale arisirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(238) Tune:Swing low,sweet chariot")){
                    String title = "Ongo(238) Tune:Swing low,sweet chariot";
                    String subtext = "    Mi so pa okporu\n    Ru Yesu Kristonirisi.\n    (x2)\n1. Andru ama fe baputizi mi dri,\n  Ru Yesu Kristonirisi;\nAma mi a'i ba Kristoniru,\n  Ru Yesu Kristonirisi.\n\n2. Te yi baputizini ecetaru\n  Ru Yesu Kristonirisi;\nAsi ma ojitani ecezu,\n  Ru Yesu Kristonirisi.\n\n3. Mi ma obi Yesu ma pamvu 'dani,\n  Ru Yesu Kristonirisi;\nMi ma aga e'yo onzi\n  Ru Yesu Kristonirisi.\n\n4. Mi ma 'di a'di e'yo nyakuni be\n  Ru Yesu Kristonirisi;\nMungu nga mi a'i i vu ra,\n  Ru Yesu Kristonirisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(239)")){
                    String title = "Ongo(239)";
                    String subtext = "1. Yi baputizi fe mi dri\n  Ru Yesunirisi,\nEcezu mi ma nga ovu\n  'Ba Kristoni 'dani.\n\n2. Yesu dra pati alaza\n  Ma ruaa misi ra,\nOnzi mini wuzu dria,\n  Mi 'bazu alaru.\n\n3. Ama 'ba pati alaza\n  Andreti minia;\nMi nga ru Yesuni e'da\n  Eceta nderidi:\n\n4. Mi asikari Yesuni;\n  Mimu a'di 'dizu\nE'yo onzi nyakuni be,\n  Satani be idi.\n\n5.Mi bi Yesu ma vuti ci,\n  Ati'bo erini,\nEngazu o'du andrusi\n  Kpere mini draria.\n\n6. Yesu aga dra ma okpo,\n  Enga di idriu;\nEri nga mi enga indi\n  Ofizu 'bua ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(240) Tune:John Browns body")){
                    String title = "Ongo(240) Tune:John Browns body";
                    String subtext = "1. Yesu kini anzi nyiri ma emu, (3)\nYi ma emu i vu.\n\n    Asi ndriza Yesuniri, (3)\n    Yesu le anzi tu.\n\n2. Anzi nyiri Yesu 'du ndra i wua, (3)\nLe yi avasi tu.\n\n3. Anzi ma dria Yesu o'ba i dri, (3)\nZi Mungu yi dri ra.\n\n4. Asi ndriza Opi Yesu fe yi dri, (3)\nMungu ma rusi ra.\n\n5. Yesu kini anzi nyiri ma emu, (3)\nYi ma emu i vu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(241) Tune:Swing low,sweet chariot")){
                    String title = "Ongo(241) Tune:Swing low,sweet chariot";
                    String subtext = "    Mungu,mi ti mi dri,\n    Mi ti mi dri ma dria fo!\n    (x2)\n\n1. Yakobo ti ndra i dri anzi dria,\n  Drileba fezu ndra yi dri;\nEri ti dri anzi ini dria,\n  Drileba fezu ndra yi dri.\n\n2. Petero ti dri 'ba Kristoni dria,\n  Yi a'izu adripiru;\nYohana ti dri 'ba Kristoni dria,\n  Yi a'izu adripiru.\n\n3. 'Ba Kristoni yi ti dri Paulo dria,\n  Muzu azi Mungunia;\nYi ti dri Baranaba ma dria,\n  Muzu azi Mungunia.\n\n4. Mi ma mba ma ta,Mungu Opi mani,\n  Asi ndriza minirisi;\nMa ma ovu mini 'dani 'dani,\n  Asi ndriza minirisi.\n\n5. Mi ezo ma Orindi minirisi,\n  Mani cazu ani 'bua;\nMi ce ma dri Orindi minisi,\n  Mani cazu ani 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(242)")){
                    String title = "Ongo(242)";
                    String subtext = "1. Emi emu e'yereru,\n  Ri Mungu ma palaa;\nEmi ga tre letasi fo\n  Emi asia.\n\n2. Mi le amurua 'dori\n  Mi asi driasi;\nLeta i depi kurisi\n  Mi bieri.\n\n3. Zamva,mi le agupi 'di;\n  Mi so oyo mini,\nAdrizu eri be Mungu\n  Ma milia.\n\n4. Emi ma ovu leta be\n  Emi eselia;\nFeta Orindini leta\n  Adaruri.\n\n5. Ama otu ama ngonde;\n  Yesuni 'ye emvi\nAma amurua ini\n  O'duzu ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(243) Tune:A wheel in a wheel")){
                    String title = "Ongo(243) Tune:A wheel in a wheel";
                    String subtext = "1. Mungu tra ama tualu, (2)\nAma 'ba alu Mungu ma milia.\n\n2. Ama le ama avasi, (2)\nMunguni ama lelenirisi.\n\n3. Ama le aci tualu, (2)\nYesu ma vuti bizu 'dani ci.\n\n4. Ama nga ama aza ko (2)\nAyiko alia,kani candi.\n\n5. Mungu fe leta ama dri, (2)\nAsi ndrizaru,asi anzu be.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(244)")){
                    String title = "Ongo(244)";
                    String subtext = "1. Orindi Alatararu,mi omve\n  Ama azi miniri ngazu,\nKabilo Munguni 'diyi ocezu;\n  Mi emu okpo fe ama dri.\n\n    Mi emu...okpo  fe...\n    Mi emu okpo fe ama dri;\n    Ama nga ani azi mini nga ra,\n    Diza Yesuniri ecezu.\n\n2. Mi fe ama ma oce 'ba mini 'diyi\n  Ale be,asi adarusi,\nNyaka orindini fezu yi dri zu,\n  Yi ma dri cezu geria ra.\n\n3. Orindi Alatararu,mi emu\n  Ama 'bazu alatararu;\nAma le ani ecta onyiru\n  Fezu 'ba mini dri etuzu.\n\n4. Mi imba ama e'yo adarusi,\n  Ama nga ani 'ba imba ra,\nE'yo Yesu Kristoniri oluzu,\n  'Bani pata isuzu beni.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(245) Hush,blessed are the dead")){
                    String title = "Ongo(245) Hush,blessed are the dead";
                    String subtext = "1. Ma leni leti ku\nMani peleri'i;\nOpi ma le leti\nMini edeleri.\n\n2. 'Ba dria drapi 'bo\nYesu alia 'diyi\nYi drilebaruni,\nYi yini ande li.\n\n3. Yi Yesu mile ndre,\nFe ayiko yi dri;\nLe Opi Yesuni\nAga afa dria.\n\n4. E Mungu,mi ini\nMindre yi milia;\nMi ayiko yini\n'Bua 'dani 'dani.\n\n5. Nyakua candi ci,\nAma owu ani;\nTe ti,ama ni ra\nYesu wu ndra indi.\n\n6. Ama ka tro wu ti,\nAsi omiza ci;\nYesu aga dra 'bo,\nAma enga indi.\n\n7. Ewu ace were\nYesuni nga ama\nOmve i vu 'bua,\n'Ba ini be dria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(246)")){
                    String title = "Ongo(246)";
                    String subtext = "1. 'Ba 'diri de azi dria,\n'Di a'di ini de 'bo;\nNga inzata ma alia,\nAga e'yo onzi dria.\n\n    Ata,ama ku mi dri\n    Andru mva mini 'diri.\n\n2. Mi vu awu wuza yo,\nCandi dria aga 'bo;\nAta nyaku 'Bapiri,\nEri fi mi milia.\n\n3. 'Dale okpo draniri\nCani vunia 'de ku;\n'Ba 'ba Papiri 'dale,\nNde ndra dra ma okpo\nra.\n\n4. Ama 'ba acepi 'diyi,\nAma ma te Yesuni;\nEri nga ama oku\nMuzu i vu 'bua ra.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(247)")){
                    String title = "Ongo(247)";
                    String subtext = "1. Ovuzu Opi be\n'Dani 'dani 'bua,\nOnyiru aga ovuzu\nNyakuari ra fo!\nAma,e'yo 'disi,\nAma asi omi:\nAma nga ovu Yesu be\n'Bua 'dani 'dani.\n\n2. Ata mani ma jo\nOvupi 'buari,\nMa ndre eri a'itasi;\nAvaniri ma va!\nPari nde ndrizaru\nYesuni edele\n'Ba i a'ipi 'diyini\nAdrizu 'daniri.\n\n3. Dra ka eca ma vu,\nMa ngani ru 'de ku;\nMa nga fi idri alia\nOvuzu Yesu be!\nMani engaria,\nMa nga Yesu inzu;\nAma nga ovu Yesu be\nBua 'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(248) Shall we gather at the river ?")){
                    String title = "Ongo(248) Shall we gather at the river ?";
                    String subtext = "1. Yi Ara ndrizaru indi\nMungu ma akua 'daa,\nAngu 'buari alia:\nYi Ara idriniri.\n\n    'Ba Yesuni opale 'diyi,\n    Yi ka nga yi oku 'bua 'dale\n    Ovuzu Opi Yesu be;\n    Ma le mani mu 'dale indi!\n\n2. Yesuni 'ba oce 'dani,\nYi dri cezu alesi\nPari iribi be turia,\nYi Ara nde ma tia.\n\n3. De nga ama cani 'dale\nYi Ara ma tia ku,\nEri 'du teri nzizaru\nAma ndepi 'doari.\n\n4. Ama ka ca ayikosi\nYi Ara idrinia,\nAma nga Yesu mile ndre,\nAma nga runi inzu.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(249) Come,ye thankful people,come")){
                    String title = "Ongo(249) Come,ye thankful people,come";
                    String subtext = "1. Ama fe awa'difo\nMungu amaniri dri\nNyaka amvuarisi;\nAma oku tini 'bo.\nAma 'ya amvu oko,\nAma ri ori indi;\nAfa dria yi ka ra\nLu Mungu ma okposi.\n\n2. Angu wudrikuru dria\nEri amvu Munguni,\nEfi kazu eri dri\nOkpo erinirisi.\nTe anya ma alia\nRegi onzi enga ra;\nMungu,mi fe ama ma\nOvu anya adaru adaru.\n\n3. Yesuni nga emvi ra\nAnya iniri lozu;\nYi nga regi onzi nze,\nOku,'bezu acia.\nMalaika erini\nYi nga regi eve dria;\nTe anya adaruri\nYi nga 'ba ero alia.\n\n4. Yesu Kristo,mi emu\nAnya mini lozu fo!\nMi oku 'ba mini dria\nOvuzu mi be 'bua.\n'Dale ama nga adri\nE'yo onzi kokoru;\nOpi Yesu,mi emu,\nMi emu ama vu fo!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(250) We plough the fields")){
                    String title = "Ongo(250) We plough the fields";
                    String subtext = "1. Ama adri amvu 'ya,\n  Ama ori ofa;\nKiri Mungu a'dule\n  Fe ozooni 'dizu.\nEri etu fe indi\nAmvu amani dria,\nNyakani kazu onyiru\n  Okpo Mungunisi.\n\n    Afa onyiru dria\n    Yi enga Mungu vu;\n    Le ama 'yo awa'difo\n    Leta erinisi.\n\n2. Afa ndrizaru dria\n  Mungu o'ba yini;\nPatifu asea 'diyi\n  Yi ovu erini.\nE,Mungu ka nyaka fe\n  Aria dri dria,\nNgani nyaka fe ama dri\n  Ereni be ku ya ?\n\n3. E,Ata,ama fe ra\n  Awa'difo mi dri;\nMi nyaka fe ama dri\n  Afa baru be dria,\nAfa awa'diforu\n  Amani fele 'diyi,\nMi ma a'i yi andru fo,\n  Asi anzurusi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(251) All things bright and beautiful")){
                    String title = "Ongo(251) All things bright and beautiful";
                    String subtext = "1. Afa dria ndrizaru,\n  Anyapa pie dria,\nMungu o'ba yi dria\n  Ondua inisi.\n\n2. Oli angu lipiri\n  Etu diza beri,\nIriti ozoo pie;\n  Mungu o'ba yini.\n\n3. Pati endriru 'diyi,\n  Nyaka onyiru be,\nYi raza pie dria;\n  Mungu o'ba yini.\n\n4. Afa amvua 'diyi,\n  Ondu pi 'du pie,\nNyaka azini pie;\n  Mungu o'ba yini.\n\n5. Aria ongo ngopi\n  Wura ndu ndu be\n    'diyi,\nPati ma fu ndrizaru;\n  Mungu o'ba yini.\n\n6. Mungu,mi fe ama dri\n  Mile afa ndrezu,\nAma mi inzi ani;\n  Mi o'ba yi dria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(252)")){
                    String title = "252";
                    String subtext = "1. Ama emu,Mungu,mi\n  vu\nAva liza ma vutia;\nAma le e'yo onizu.\nMungu,mi ma imba\n  ama.\n\n    Onita,onita,\n    Ama le e'yo oni ra;\n    Ama le ondua isu,\n    Mungu,mi ma imba\n      ama;\n    Onita,onita,\n    Ama le e'yo oni ra.\n\n2. Ama oku ama dika\nAsi awa'diforusi;\nAma le e'yo onizu.\nMungu,mi ma imba\n  ama.\n\n3. Mi fe ondua mini 'ba\nAma imbapi 'diyi dri;\nAma le e'yo onizu,\nMungu,mi ma imba\n  ama.\n\n4. Ruta 'bani mi ruzuri\nOndua ma e'dozani;\nAma le e'yo onizu,\nMungu,mi ma imba\n  ama.\n\n5. Ama le mi ce ama dri\nTermi 'dori ma alia;\nAma le e'yo onizu\nMungu,mi ma imba\n  ama.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(253)")){
                    String title = "Ongo(253)";
                    String subtext = "1. Mungu,mi ku ama\n    muzu\n  Asi ndriza minisi.\nAma le mi ru inzizu,\n  Ama fe awa'difo\nMini ama aza kole\n  Termi agapirisi,\nMini ama agei tele\n  Ecazu andrurisi.\n\n2. Mite ama ma agei\n  Ama vile akua.\nAma ma isu ayiko\n  Geri onyirurisi;\nAma ma o'bi etuzu\n  E'yo onyiru 'yezu,\nAmani ama onazu\n  E'yo onzi driasi.\n\n3. Mi fe okpo ama dri fo\n  Azi amani alia,\nE'yo kiliru 'yezu,\n  Mi inzizu etuzu.\nAma 'ye ama ere 'di\n  Muzu pari ndu ndua;\nAma di ama ku mi dri\n  Ru Yesu Kristonisi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(254)")){
                    String title = "Ongo(254)";
                    String subtext = "1. Awa'difo,Opi,mi dri\nMini ama ma ta mbale,\nMini ama ofule ra\nIni ma aliarisi.\n\n2. Awa'difo,Opi,mi dri\nInini agalerisi;\nMi fe 'yeta amani 'diyi\nFe diza mi dri andru fo!\n\n3. Awa'difo,Opi,mi dri\nEtu o'diru 'dorisi;\nMi ce ama dri andru fo,\nAsi ndriza minirisi.\n\n4. Awa'difo,Opi,mi dri\nMini ama lelerisi;\nMi fe drileba ama dri\nOri'ba amani pie.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(255) Forth in thy name")){
                    String title = "Ongo(255) Forth in thy name";
                    String subtext = "1. Mungu ata,ama 'ye fu\nAzi ngazu ru minisi;\nMi fe amani mi nizu\nE'yo dria ma alia.\n\n2. Azi mini feleniri\nAma ma 'ye ayikosi;\nAma nga drileba isu\nAsi ndriza miniri be.\n\n3. Ama fe di ama mi dri,\nMi ko ama aza 'dani;\nAma ku ama mi dria\nE'yo miniri 'yezu'i.\n\n4. Rua amani 'diyi dria,\nOpi,ama fe mi dri pi;\nAma le mi ayu ama\nAzi miniri ngazu fo!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(256) Awake,my soul")){
                    String title = "Ongo(256) Awake,my soul";
                    String subtext = "1. Ama enga,ama enga\nAzi andruniri ngazu;\nAma enga,ama fe\nInzita o'bitisiri.\n\n2. Ama 'yo awa'dinia\nMini ama lelerisi,\nMini ama agei tele\nIni ma aliarisi.\n\n3. Ama ma o'bi ovuzu\nEgata kililiru be;\nE'yo ewaru ka eca,\nAma ma ega Yesu'i.\n\n4. Ama 'ye e'yo ada'i\nLokiri kokoru andru;\nMungu ni e'yo zizaru,\nEgata 'bani be dria.\n\n5. Mungu,mi fe diza mini\nGeri 'izu ama dri fo;\nKumu kazu ama ma pa\nSizu onzi candi be ku.\n\n6. Mungu,mi enga ama fo,\nMi fe Orindi miniri\nAmani ani mi lezu,\nAzi ngazu mi dri indi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(257) At thy feet,O Christ,we lay")){
                    String title = "Ongo(257) At thy feet,O Christ,we lay";
                    String subtext = "1. Yesu,ama ku mi dri\nO'du andru 'dori'i;\nAma nini geri ku,\nMi ce ama dri ani,\nAma ma aci andru\nGeri mini ma alia.\n\n2. Yesu,mi ovu andru\nAyiko amaniri;\nAma ka candi isu,\nMi omi ama asi;\nMi mba ama ta,ama\nKazu onzi 'yezu ku.\n\n3. Mi fe andru ama dri\nOndua miniri fo!\nAma le ama ona\nE'yo onzi driasi;\nMi ce ama dri rile\nE'yo onyiru 'yezu.\n\n4. Le mi ma imba ama\nE'yo siza minisi;\nAma le aci andru\nImbata mini vusi;\n'Yeta amani dria\nMa fe mi dri ayiko.\n\n5. Ama mi zi curu'do,\nOpi,mi eri ama;\nAma nga mu azi nga\nMi dri asi alusi;\nYesu,ama nga ani\nDiza miniri ece.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(258)")){
                    String title = "Ongo(258)";
                    String subtext = "1. Yesu,Opi amani la,\n  Mi diza nyakuni;\nMi fe anguni atizu\n  Diza minirisi.\n\n2. Mi wu onzi amaniri;\n  Mi ce ama ma dri,\nAmani ama onazu\n  E'yo onzisi dria.\n\n3. Ama fe ama pi mi dr\n  Afa fezarile;\nAma le e'yo miniri\n  'Yezu avasi ra.\n\n4. Amani azi ngaria\n  Mi fe okpo mini;\nAma ma 'ye e'yo dria\n  Diza fezu mi dri.\n\n5. Ama mi ru inzi andru\n  Pata minirisi;\nAma le mi ma vuti bi\n  Geri miniria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(259) O Jesus,Lord of heavenly grace")){
                    String title = "Ongo(259) O Jesus,Lord of heavenly grace";
                    String subtext = "1. Yesu Opi 'buari'i,\nMi diza be Atanile;\nMi 'i angu ama dri fo,\nMi fe ama ma va e'yo.\n\n2. Mi diza nyakuniri la,\nMi 'i ama dri geri fo;\n'Ba ka mi vuti bi ada,\nYi nga aci diza alia.\n\n3. Mi Opi asi ndrizani,\nMi fe asi anzuru fo;\nOrindi Alatararu\nMa ri ama asia ci.\n\n4. Mi fe ayiko miniri\nMa ga ama asia tre;\nAma ma 'yo awa'difo\nO'biti vusi ondre be.\n\n5. Mi 'Ba ama Papiri le,\nAma le mi ma mile ndre;\nO'biti vusi mi ma fe\nAmani mi egazu fo!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(260) Jesus,from thy throne")){
                    String title = "Ongo(260) Jesus,from thy throne";
                    String subtext = "1. Yesu Opi 'buari,\nMi ndre ama avasi;\nMi ega ama e'yo,\n  Mi eri ama.\n\n2. Yesu,mi mba ama ta\nAmani aciria;\nO'du dria alia\n  Mi eri ama.\n\n3. Ama ka ama la va\nO'du kozu inisi,\nMi ma te ama agei;\n  Mi eri ama.\n\n4. Le mi fe ava mini,\nAma asi alia\nMa va ama tu 'dani;\n  Mi eri ama.\n\n5. Mi ce ama dri andru\nGeri mini alia,\nAma ma ku onzi ja;\n  Mi eri ama.\n\n6. Le mi obu ama be;\nAma le ovu mini,\nAma le mi ru inzi;\n  Mi eri ama.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(161) The day thou gavest")){
                    String title = "Ongo(161) The day thou gavest";
                    String subtext = "1. O'du,Opi,mini feleri\n  De i ra,anguni bi bi;\nO'bitisi ama inzi mi,\n  Inisi ama ngo 'dani.\n\n2. 'Ba yi awa'difo fe mi dri\n  Angu dria ma alia;\n'Ba ru mini a'ipi 'diyi\n  Yi mi inzi pari dri dria.\n\n3. Angu azini ma alia,\n  'Ba 'dayi e'yo zi mi tia;\nYi ru miniri inzi 'dani\n  De ama o'duko 'doa.\n\n4. 'Ba mini mu e'yo oluzu\n  Ziri,angu andinia;\nOpi,le mi fe okpo yi dri\n  'Ba nde esezu mi vu ra.\n\n5. Yesu,opi mini nyaleri\n  Ngani i de aluni ku;\nSuru nyakua 'diyi nga de ra,\n  Te miniri pa so cini.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(262) Now the day is over")){
                    String title = "Ongo(262) Now the day is over";
                    String subtext = "1. Etuni 'ye 'de 'di,\n  Angu 'ba bi 'bo;\nIni 'ba i asu\n Angu milia.\n\n2. Mi fe mani lazu\n  Va o'du kozu;\nMi bi ma ma mile\n  Ava minisi.\n\n3. Mani o'du koria\n  Ini 'doria,\nMalaika mini\n  Ma te ma agei.\n4. Ma rua ande ra,\nOkpo mani yo;\nMi fe mani o'du\n  Kozu kilili.\n\n5. Angu ka ati ra,\n  Mi fe ma enga\nOkpo be alaru\n  Mi ma milia.\n\n6. Diza mi dri,Ata,\n  Mva miniri be;\nDiza mi dri 'dani\n  Orindi pie.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(263) Day is dying in the west")){
                    String title = "Ongo(263) Day is dying in the west";
                    String subtext = "1. O'du 'dori de i bo,\nAzi de ra ,'ba ma la;\nEmi inzi Mungu ru\nDe nga 'bi'bio 'yani\n  Nga 'bua ku.\n\n    alatararuri,Opi Mungu,\n    'Ba ovupi nyakua,\n    'Ba ovupi 'bua 'diyi\n    Yi mi inzi.\n\n2. Mi idri e'iru mi,\nMi 'du 'ba mi lepi 'diyi\nAsi yini omizu;\nMi mba ama ta 'dani\n  Mi alesi.\n\n3. Angu ja ati drua ra,\nMi fe ama enga dria\nAzi ngazu mi dri ra,\nRu miniri inzizu\n  Ayikosi.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(264)")){
                    String title = "Ongo(264)";
                    String subtext = "1. Yesuni etu maniri,\nEri angu 'i ma drini;\nEri ka ovu ma be ci,\nMa ovuni inia ku.\n\n2. Ma ka la va inisi ra,\nYesuni ma agei teni;\nKoni o'du ini rra ku,\nErini ma ta mbaria.\n\n3. Ma ka ovu azoru ti,\nOpi Yesuni ma be ci;\nEri ma asi omini\nOkpo fezu ma dri indi.\n\n4. Dra ka tro ci,Yesu indi\nAngu 'izu 'ba drilia;\nAngu bizani nga ati,\nYesuni 'ba engaria.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(265) At even,ere the sun was set")){
                    String title = "Ongo(265) At even,ere the sun was set";
                    String subtext = "1. Yesu,ndra ondre 'darisi\n  Yi ei 'ba azo be 'diyi;\nYi emu mi vu candidi,\n  Mvi ayikosi akua.\n\n2. Angu bi ra,ama emu\n  Mi vu candi amani be;\nAma ndreni mi rua ku,\n  Te ama ni ra mi indi.\n\n3. Yesu,mi ama Papiri,\n  Mi ati asi amani;\n'Ba azi 'diyi candi be,\n  Azi 'diyi leni mi ku.\n\n4. 'Ba azi 'diyi mvi vile,\n  Asi yini azoru tu;\n'Ba yi atipini 'de yo,\n  Mi a'dule,mi eco ra.\n\n5. E'yo onzi 'banirisi\n  'Ba asi anzu beni yo;\nTe 'ba mi vuti bipi 'diyi\n  Ni e'yo onzi yini ra.\n\n6. Ndra mini 'ba eloria,\n  Yi rua ati dria ra;\nMi eri zita amani,\n  Mi ati ama asi fo!\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(266) Psalms 95.1-7")){
                    String title = "Ongo(266) Psalms 95.1-7";
                    String subtext = "1. Ama emu,ama ma ngo\n  Ongo Yehova dri,\nAma ma oyu uru fo\n  Awa'difo fezu.\nAma inzi ayikosi\n  Kata pataniri;\nAma zaburi 'diri ngo\n  Yehova Mungu vu.\n\n2. O'duko ayikonisi\n  Ama inzi eri,\nAma ngo ongo eri ru\n  Inzizu 'diyi fo!\nA'disiku Yehovani\n  Mungu amboruni,\nAga adrou dria ra;\n  Eri Opiruni.\n\n3. Pari aliru nyakua\n  Yi eri ma dria;\nOni izu ma dri mbili\n  Yi erini indi;\nTe miri ovu erini,\n  Eri 'ba eri ra;\nDri erini ede angu\n  A'wiruri indi.\n\n4. Ama emu eri inzi,\n  Ama ma avu va,\nAma kumuti osi va\n  Yehova ma milia;\nYehova Mungu amani,\n  Ama 'ba erini;\nMunguni ama oceni\n  Kabilo inile.\n\n5. Diza ma ovu Ata vu,\n  Yesu vu indi fo\nMa fe Orindi dri indi:\n  Mungu Okpo beri;\nEkile yini dizani\n  Fele driorile,\nYi nga vini inzita fe\n  Ewule ewule.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(267) Luke 1.68-79")){
                    String title = "Ongo(267) Luke 1.68-79";
                    String subtext = "1. Mungu Israeliniri\n  Ma ovu inzizaru;\nEri andri 'ba ini 'diyi\n  Yi onzezu onzia;\nEnga o'yu pataniri\n  Jo Daudiniria,\nEkile ini ndra'yole\n  Nabi ma tisirile.\n\n2. Pata Munguni 'yeleri\n  Ama pazu juru dri,\nAzini 'ba ama ngupi\n  'Diyi dri driari'i;\n'Ba yiki iniri ani\n  Ama ma a'bipi vu,\nE'yo ini ndra azile\n  Yi tiari egazu.\n\n3. 'Di oyo erini sole\n  Ibrahimu ma tia,\nAma pazu ama juru\n  'Diyi dri driari'i,\nAma ma nga aziniri\n  Uri kokoru beni,\nE'yo kililiru 'yezu\n  Ewu amanisi dria.\n\n4. Te mi'i,mva maniri la,\n  'Ba yi nga mi ru omve\nMungu Uru 'Buari ma\n  Nabi alatarari;\nMi nga mu Opi drilia\n  Letini edezu ra,\nFezu 'bani pata nizu\n  E'yo onzi wuzasi.\n\n5. Asi ndriza Mungunisi\n  Diza enga 'bua ra,\nFe di anguni atizu\n  'Ba inia 'diyi dri;\nEri emu angu 'izu\n  'Ba dra rupi 'diyi dri,\nAma ma dri cezu geri\n  Asi anzuniria.\n\n6. Diza ma ovu Ata vu,\n  Mvi erini vu indi,\nDiza ma ovu Orindi\n  Alatararuri vu;\nKile yini diza fele\n  Okokele ndrarile,\nYi nga vini inzita fe\n  Ewule 'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(268) Psalms 100")){
                    String title = "Ongo(268) Psalms 100";
                    String subtext = "1. 'Ba angu drisi dria 'diyi,\n  Emi ma oyu uru\nO'duko ayikorusi\n  Opi Yehova vu fo!\nEmi nga azi eri dri\n  Ayiko be asia;\nEmi emu drilenia\n  Inzitani ongozu.\n\n2. Emi ma ni Yehovani\n  Munguruni a'dule;\nEri 'ba andra amani,\n  Ama 'ba erini 'diyi.\nTe ama kabilo indi\n  Mungu ma nyamukoa;\nEmi fi kalitilea\n  Eri ma ru inzizu.\n\n3. Emi ma fe awa'difo\n  Eri dri inzita be;\nIrii erini ma alia\n  Emi fi inzitasi;\nYiki aleru erini\n  Ovu 'dani 'daniru;\nE'yo ada eriniri\n  Ca a'bianzi vusi.\n\n4. Diza ma ovu Ata vu,\n  Mvi erini vu indi,\nDiza ma ovu Orindi\n  Alatararuri vu;\nKile yini diza fele\n  Okokele ndrarile,\nYi nga vini inzita fe\n  Ewule 'dani 'dani.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(269) Luke 1.46-55")){
                    String title = "Ongo(269) Luke 1.46-55";
                    String subtext = "1. Ma asi inzi Opini,\n  Ma ovu ayikosi tu\nMungu 'Ba ma Papirisi,\n  Asi mani ma alia;\nErini i ma ati'bo\n  Ma candi egalerisi.\n\n2. Mi ndre,engazu curu'do\n  A'bianzi dria yi nga\nMa omve drilebaruni,\n  A'disikuniri Mungu\nOvupi okpo be turi\n  'Ye ma vu e'yo amboni.\n\n3. Runi Alatararu'i;\n  Yikiniri nga eca ra\n'Ba eri rupi 'diyi ma dria,\n  A'bianzi vusi dria,\nAda,'ba e'yo erini\n  Inzipi 'diyi ma dria.\n\n4. Eri 'ye e'yo okporu:\n  'Ba asia afu be 'diyi\nEre yi teketeke ra,\n  Asisile yinirisi;\nOnze opi amboru 'diyi\n  Ogunga ma driarisi.\n\n5. 'Ba 'ba ele 'diyi uru;\n  Fe 'ba abiri be 'diyi\nMa tra afa onyirusi;\n  Te pe 'ba afa e'iru\nLonyi be tre 'diyi ma ti\n  Mvizu akua pirini.\n\n6. Eri ko ati'bo ini\n  Israeli ma aza ra;\nAsi ndriza ndra azile\n  Ibrahimu pi ma tia\nOri'ba erini beri\n  Avini eri dri 'de ku.\n\n7. Diza ma ovu Ata vu,\n  Vini Mvi eriniri vu\nDiza ma ovu Orindi\n  Alatararu vu indi;\nDiza amboru ma ovu\n  Mungu vu 'dani 'dani fo.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(270) Psalms 98.1-4")){
                    String title = "Ongo(270) Psalms 98.1-4";
                    String subtext = "1. Emi ma ngo Opi dri\n  Ongo o'diru fo,\nErini tali 'yele\n  I ma drisirisi:\nAga e'yo onziri\n  Okpo inirisi,\nEce pata iniri\n  Suru ma milia\n\n2. Ega yiki iniri\n  Israeli vu ra,\n'Ye ini ndra azile\n  Yi ma tiarile;\n'Ba angu kalatini\n  Asizuria 'diyi\nYi ndre pata Munguni\n  'Ba opazuri'i.\n\n3. Emi 'ba angu dria\n  Ma alia 'diyi,\nEmi inzi Opini\n  Ongo o'dirusi;\nEmi ngo ayikosi\n  Runiri inzizu,\nYehova 'ba ini\n  Opalenirisi.\n\n4. 'Ba dria ma fe diza\n  Ata amani dri,\nMvi eriniri pie,\n  Orindiniri be;\nEkile yini diza\n  Fele okokele,\nAzini ngale fele\n  'Dani 'danirile.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(271) Luke 2.29-32")){
                    String title = "Ongo(271) Luke 2.29-32";
                    String subtext = "1. Opi la,curu'do\n  Mi ku mi ati'bo\nMa mvi asi anzuru be,\n  Mini 'yolerile.\n\n2. A'disiku ma ndre\n  Pata miniri ra,\nMini edele 'ba dria\n  Ma miliari 'bo;\n\n3. Angu 'zu suru\n  'Bani 'diyi vu dria,\n'Ba mini Israelini\n  Ma diza ecezu.\n\n4. Ata,diza mi dri,\n  Mvi miniri pie,\nOrindi mini be indi,\n  'Dani 'dani 'bua.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
                else if (selected.equals("Ongo(272) Psalms 67")){
                    String title = "Ongo(272) Psalms 67";
                    String subtext = "1. Mungu,mi ovu yikisi ama vu,\nMi fe asi ndriza ama dri fo!\nMi fe mi mile ma di ama dria\nAngu 'izu ama dri etuzu.\n\n2. Mi fe 'ba ovupi nyakua 'diyi\nMa ni ani leti miniri'i;\nSuru 'bani dria yi ma ni indi\nOkpo miniri 'ba opazuri.\n\n3. 'Ba wudrikuru dria ma inzi mi,\nYi ma inzi mi,Mungu Opi la!\nSuru dria ma ovu ayikosi,\nYi ma ngo ongo ayikosi fo.\n\n4. Mi adri 'ba e'yo li kililiru,\nMi adri 'ba dri ce nyakuani;\n'Ba wudrikuru dria ma inzi mi,\nYi ma inzi mi,Mungu Opi la!\n\n5. Nyaku ka nyaka ndu ndu ama dri 'bo;\nMungu,ada Mungu amaniri\nNga asi ndriza fe ama dri 'dani;\n'Ba dria yi ma ru eri ani.\n\n6. 'Ba ma fe diza Ata pi vu Mvi be,\nOrindi Alatararu pie;\nEkile yini diza fele drio,\nDika ewu vusi driarile.\n\n";
                    Intent intent = new Intent(MainActivity.this, PageView.class);
                    intent.putExtra("subtext",subtext);
                    intent.putExtra("title",title);
                    startActivity(intent);
                }
            }
        });

        navigationView = findViewById(R.id.navview);
        drawerLayout = findViewById(R.id.drawer);

        //adding customised toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //toggle button
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        //when an item is selected from menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.share:
                        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                        intent.setType("text/plain");
                        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "OngoBuku");
                        intent.putExtra(android.content.Intent.EXTRA_TEXT, "OngoBuku is an app that contains all lugbara hymns,get your own copy via the link\n https://play.google.com/store/apps/details?id=com.atom.ongobuku");
                        startActivity(Intent.createChooser(intent, "Share via"));
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.moreApps:
                        Intent i = new Intent(android.content.Intent.ACTION_VIEW);
                        i.setData(Uri.parse("https://play.google.com/store/apps/developer?id=Prince%20Software%20Systems"));
                        startActivity(i);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.about:
                        Intent v = new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(v);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                }
                return true;
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.menu_search,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.ongowere:
                Intent x = new Intent(MainActivity.this, OngoWere.class);
                startActivity(x);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void searchActivity(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

}