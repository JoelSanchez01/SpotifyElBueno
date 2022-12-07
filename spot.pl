%Artista
artista(bts).
artista(panic_at_the_disco).
artista(jose_madero).
artista(harry_styles).
artista(stray_kids).

%Album
album(be).
album(map_of_the_soul_7).
album(love_yourself_answer).
album(too_weird_to_live_too_rare_to_die).
album(death_of_a_bachelor).
album(viva_las_vengeance_A).
album(psalmos).
album(carmesi).
album(noche).
album(giallo).
album(fine_line).
album(harry_styles_A).
album(harrys_house).
album(i_am_you).
album(cle_1_miroh).
album(go_live).
album(in_life).

%Cancion
cancion(dynamite).
cancion(girls/girls/boys).
cancion(entre_comillas).
cancion(watermelon_sugar).
cancion(as_it_was).
cancion(ugh).
cancion(fake_love_rocking_vibe_mix).
cancion(emperors_new_clothes).
cancion(lamentable).
cancion(documentales).
cancion(kiwi).
cancion(viva_las_vengeance).
cancion(middle_of_a_breakup).
cancion(mcmlxxx).
cancion(little_freak).
cancion(mic_drop).
cancion(get_cool).
cancion(maze_of_memories).
cancion(slump).
cancion(gods_menu).

%Idioma
idioma(ingles).
idioma(espanol).
idioma(coreano).

%idioma cancion
idioma_cancion(dynamite,ingles).
idioma_cancion(girls/girls/boys,ingles).
idioma_cancion(entre_comillas,espanol).
idioma_cancion(watermelon_sugar,ingles).
idioma_cancion(as_it_was,ingles).
idioma_cancion(ugh,coreano).
idioma_cancion(fake_love_rocking_vibe_mix,coreano).
idioma_cancion(emperors_new_clothes,ingles).
idioma_cancion(lamentable,espanol).
idioma_cancion(documentales,espanol).
idioma_cancion(kiwi,ingles).
idioma_cancion(viva_las_vengeance,ingles).
idioma_cancion(middle_of_a_breakup,ingles).
idioma_cancion(mcmlxxx,espanol).
idioma_cancion(little_freak,ingles).
idioma_cancion(mic_drop,coreano).
idioma_cancion(get_cool,coreano).
idioma_cancion(maze_of_memories,coreano).
idioma_cancion(slump,coreano).
idioma_cancion(gods_menu,coreano).

%aqui voy a ligar las canciones a los albumes
pertenece_album(dynamite,be).
pertenece_album(girls/girls/boys,too_weird_to_live_too_rare_to_die).
pertenece_album(entre_comillas,carmesi).
pertenece_album(watermelon_sugar,fine_line).
pertenece_album(as_it_was,harrys_house).
pertenece_album(ugh,map_of_the_soul_7).
pertenece_album(fake_love_rocking_vibe_mix,love_yourself_answer).
pertenece_album(emperors_new_clothes,death_of_a_bachelor).
pertenece_album(lamentable,psalmos).
pertenece_album(documentales,giallo).
pertenece_album(kiwi,harry_styles_A).
pertenece_album(viva_las_vengeance,viva_las_vengeance_A).
pertenece_album(middle_of_a_breakup,viva_las_vengeance_A).
pertenece_album(mcmlxxx,noche).
pertenece_album(little_freak,harrys_house).
pertenece_album(mic_drop,love_yourself_answer).
pertenece_album(get_cool,i_am_you).
pertenece_album(maze_of_memories,cle_1_miroh).
pertenece_album(slump,go_live).
pertenece_album(gods_menu,in_life).

%Aqui voy a ligar las canciones a los generos
pertenece_genero(dynamite,pop).
pertenece_genero(girls/girls/boys,pop).
pertenece_genero(entre_comillas,pop).
pertenece_genero(watermelon_sugar,pop).
pertenece_genero(as_it_was,pop).
pertenece_genero(ugh,rap).
pertenece_genero(fake_love_rocking_vibe_mix,rock).
pertenece_genero(emperors_new_clothes,rock).
pertenece_genero(lamentable,rock).
pertenece_genero(documentales,rock).
pertenece_genero(kiwi,rock).
pertenece_genero(viva_las_vengeance,alternativo).
pertenece_genero(middle_of_a_breakup,alternativo).
pertenece_genero(mcmlxxx,alternativo).
pertenece_genero(little_freak,alternativo).
pertenece_genero(mic_drop,hiphop).
pertenece_genero(get_cool,pop).
pertenece_genero(maze_of_memories,rap).
pertenece_genero(slump,rock).

%ligar canciones a artistas
pertenece_artista(dynamite,bts).
pertenece_artista(girls/girls/boys,panic_at_the_disco).
pertenece_artista(entre_comillas,jose_madero).
pertenece_artista(watermelon_sugar,harry_styles).
pertenece_artista(as_it_was,harry_styles).
pertenece_artista(ugh,bts).
pertenece_artista(fake_love_rocking_vibe_mix,bts).
pertenece_artista(emperors_new_clothes,panic_at_the_disco).
pertenece_artista(lamentable,jose_madero).
pertenece_artista(documentales,jose_madero).
pertenece_artista(kiwi,harry_styles).
pertenece_artista(viva_las_vengeance,panic_at_the_disco).
pertenece_artista(middle_of_a_breakup,panic_at_the_disco).
pertenece_artista(mcmlxxx,jose_madero).
pertenece_artista(little_freak,harry_styles).
pertenece_artista(mic_drop,bts).
pertenece_artista(get_cool,stray_kids).
pertenece_artista(maze_of_memories,stray_kids).
pertenece_artista(slump,stray_kids).
pertenece_artista(gods_menu,stray_kids).

obtener_cancion_genero(X,A,Y,Z):-pertenece_genero(X,A),pertenece_artista(X,Y),pertenece_album(X,Z).
obtener_cancion_idioma(X,A,Y,Z):-idioma_cancion(X,A),pertenece_artista(X,Y),pertenece_album(X,Z).
obtenertodo(X,A,Y,Z,B):-idioma_cancion(X,A),pertenece_artista(X,Y),pertenece_album(X,Z),pertenece_genero(X,B).











