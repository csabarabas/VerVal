Lab1:
Irjunk egy LogAnalyzer nevu osztalyt egy bool isTheFileValid(string fajl_nev) metodussal.
Ez a metodus eldonti egy parameterkent kapott fajlnevtrol, hogy ervenyes logfajl-e: megnezi a fajl vegzodeset, es amennyiben ez "slf", akkor ervenyes.

Lab2:
Teszteljuk a LogAnalyzert ervenyes, illetve nem ervenyes fajlnevekkel. Hasznaljunk test-fixture-ket setup() (C-ben pld itt foglalunk memoriat a LogAnalyzernek), teardown() (felszabaditjuk a memoriat) metodusokkal. 
Tul rovid fajlnev eseten az isTheFileValid metodus kivetelt dob. Testzeljuk, hogy valoban megtortenik-e a kiveteltdobas.
Tiltsunk le tesztet (GoogleTest eseten DISABLED_ segitsegevel).
Adjunk peldat parametrizalt tesztre.

Lab3:
Az isTheFileVaid metodus egy FileExtManager-nek tovabbitja annak eldonteset, hogy ervenyes-e a fajlnev.
Ez egy kulso fuggoseg, amit a teszt soran egy fake-kel helyettesitunk.
A fake tobbfelekeppen bejuttathatjuk a teszt soran a LogAnalyzerbe:
1. konstruktorban atadjuk parameterkent
2. set metodussal

Lab4:
Kulso fuggoseg megszuntetese folytatas:
3. A LogAnalyzer a konstruktorban ker egy FileExtManager-t egy Factory-tol. Teszt soran Factory setMgr metodusaval elozoleg atadhatok a Factory-nek egy FakeFileExtManager peldanyt. Ebben az esetben ezt teriti vissza a createMgr.
4. A LogAnalyzer-ben minden esetben, amikor egy FileExtManager peldanyra van szuksegunk, meghivunk egy virtualis getManager() metodust, ami visszaterit egyet. Teszteles celjabol a LogAnalyzer-bol szarmaztatunk egy TestableLogAnalyzer-t, amiben ugy definialjuk a getManager()-t, hogy fake-et teritsen vissza.