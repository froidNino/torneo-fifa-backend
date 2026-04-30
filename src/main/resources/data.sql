-- 1. USUARIOS 
INSERT INTO usuarios (username, password, rol) VALUES ('admin', 'fifa2026', 'FUNCIONARIO');
INSERT INTO usuarios (username, password, rol) VALUES ('invitado', 'futbol123', 'AFICIONADO');

-- 2. LOS 12 GRUPOS (A - L)
INSERT INTO grupos (id) VALUES ('A');
INSERT INTO grupos (id) VALUES ('B');
INSERT INTO grupos (id) VALUES ('C');
INSERT INTO grupos (id) VALUES ('D');
INSERT INTO grupos (id) VALUES ('E');
INSERT INTO grupos (id) VALUES ('F');
INSERT INTO grupos (id) VALUES ('G');
INSERT INTO grupos (id) VALUES ('H');
INSERT INTO grupos (id) VALUES ('I');
INSERT INTO grupos (id) VALUES ('J');
INSERT INTO grupos (id) VALUES ('K');
INSERT INTO grupos (id) VALUES ('L');

-- 3. LOS 48 EQUIPOS (MUNDIAL 2026)
-- CONMEBOL (6 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Colombia', 'CONMEBOL', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Brasil', 'CONMEBOL', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Argentina', 'CONMEBOL', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Uruguay', 'CONMEBOL', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Ecuador', 'CONMEBOL', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Venezuela', 'CONMEBOL', 0, 0, 0, 0, 0, 0);

-- UEFA (16 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('España', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Francia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Inglaterra', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Alemania', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Portugal', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Italia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Países Bajos', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Croacia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Suiza', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Bélgica', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Dinamarca', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Serbia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Polonia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Suecia', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Gales', 'UEFA', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Escocia', 'UEFA', 0, 0, 0, 0, 0, 0);

-- CONCACAF (6 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('USA', 'CONCACAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('México', 'CONCACAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Canadá', 'CONCACAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Costa Rica', 'CONCACAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Panamá', 'CONCACAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Jamaica', 'CONCACAF', 0, 0, 0, 0, 0, 0);

-- AFC (8 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Japón', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Corea del Sur', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Irán', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Australia', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Arabia Saudita', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Qatar', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Uzbekistán', 'AFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('EAU', 'AFC', 0, 0, 0, 0, 0, 0);

-- CAF (9 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Marruecos', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Senegal', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Egipto', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Argelia', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Nigeria', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Camerún', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Costa de Marfil', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Ghana', 'CAF', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Mali', 'CAF', 0, 0, 0, 0, 0, 0);

-- OFC (3 equipos)
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Nueva Zelanda', 'OFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Fiyi', 'OFC', 0, 0, 0, 0, 0, 0);
INSERT INTO equipos (nombre, confederacion, goles_favor, goles_contra, puntos, partidos_jugados, tarjetas_amarillas, tarjetas_rojas) VALUES ('Tahití', 'OFC', 0, 0, 0, 0, 0, 0);

-- ASIGNACIÓN PRECARGADA DE GRUPOS (MUNDIAL 2026)
-- GRUPO A
UPDATE equipos SET grupo_id = 'A' WHERE nombre IN ('Colombia', 'España', 'Países Bajos', 'Marruecos');
-- GRUPO B
UPDATE equipos SET grupo_id = 'B' WHERE nombre IN ('Brasil', 'Francia', 'Australia', 'Argelia');
-- GRUPO C
UPDATE equipos SET grupo_id = 'C' WHERE nombre IN ('Argentina', 'Inglaterra', 'Escocia', 'Nigeria');
-- GRUPO D
UPDATE equipos SET grupo_id = 'D' WHERE nombre IN ('Uruguay', 'Alemania', 'Japón', 'Camerún');
-- GRUPO E
UPDATE equipos SET grupo_id = 'E' WHERE nombre IN ('Ecuador', 'Portugal', 'Corea del Sur', 'Costa de Marfil');
-- GRUPO F
UPDATE equipos SET grupo_id = 'F' WHERE nombre IN ('Venezuela', 'Italia', 'Irán', 'Ghana');
-- GRUPO G
UPDATE equipos SET grupo_id = 'G' WHERE nombre IN ('USA', 'Bélgica', 'Senegal', 'Uzbekistán');
-- GRUPO H
UPDATE equipos SET grupo_id = 'H' WHERE nombre IN ('México', 'Croacia', 'Egipto', 'EAU');
-- GRUPO I
UPDATE equipos SET grupo_id = 'I' WHERE nombre IN ('Canadá', 'Suiza', 'Arabia Saudita', 'Mali');
-- GRUPO J
UPDATE equipos SET grupo_id = 'J' WHERE nombre IN ('Costa Rica', 'Dinamarca', 'Qatar', 'Nueva Zelanda');
-- GRUPO K
UPDATE equipos SET grupo_id = 'K' WHERE nombre IN ('Panamá', 'Serbia', 'Suecia', 'Fiyi');
-- GRUPO L
UPDATE equipos SET grupo_id = 'L' WHERE nombre IN ('Jamaica', 'Polonia', 'Gales', 'Tahití');

-- ==========================================================
-- SIMULACIÓN RÁPIDA DE LA FASE DE GRUPOS (Todos juegan 3 partidos)
-- ==========================================================

-- 1. LOS LÍDERES DE GRUPO (3 victorias = 9 Puntos)
UPDATE equipos SET partidos_jugados = 3, puntos = 9, goles_favor = 6, goles_contra = 1 
WHERE nombre IN ('Colombia', 'Brasil', 'Argentina', 'Uruguay', 'Ecuador', 'Venezuela', 'USA', 'México', 'Canadá', 'Costa Rica', 'Panamá', 'Jamaica');

-- 2. LOS SEGUNDOS LUGARES (2 victorias, 1 derrota = 6 Puntos)
UPDATE equipos SET partidos_jugados = 3, puntos = 6, goles_favor = 4, goles_contra = 3 
WHERE nombre IN ('España', 'Francia', 'Inglaterra', 'Alemania', 'Portugal', 'Italia', 'Bélgica', 'Croacia', 'Suiza', 'Dinamarca', 'Serbia', 'Polonia');

-- 3. LOS TERCEROS LUGARES (1 victoria, 2 derrotas = 3 Puntos)
UPDATE equipos SET partidos_jugados = 3, puntos = 3, goles_favor = 2, goles_contra = 4 
WHERE nombre IN ('Países Bajos', 'Australia', 'Escocia', 'Japón', 'Corea del Sur', 'Irán', 'Senegal', 'Egipto', 'Arabia Saudita', 'Qatar', 'Suecia', 'Gales');

-- 4. LOS ELIMINADOS EN FASE DE GRUPOS (0 victorias = 0 Puntos)
UPDATE equipos SET partidos_jugados = 3, puntos = 0, goles_favor = 0, goles_contra = 6 
WHERE nombre IN ('Marruecos', 'Argelia', 'Nigeria', 'Camerún', 'Costa de Marfil', 'Ghana', 'Uzbekistán', 'EAU', 'Mali', 'Nueva Zelanda', 'Fiyi', 'Tahití');

-- ==========================================================
-- PRUEBA DE ESTRÉS: SIMULACIÓN DE MUERTE SÚBITA
-- (Elimina a 31 equipos en el orden matemático exacto para coronar al Campeón)
-- ==========================================================
-- 1. LIMPIAR EL ERROR (Volvemos a fase de grupos)
UPDATE equipos SET eliminado = false;

-- 2. ELIMINADOS EN 16AVOS (Jugaron 4 partidos en total y perdieron)
UPDATE equipos SET eliminado = true, partidos_jugados = 4 WHERE nombre IN ('Japón', 'Irán', 'Gales', 'Escocia', 'Egipto', 'Corea del Sur', 'Australia', 'Arabia Saudita', 'Suiza', 'Serbia', 'Portugal', 'Polonia', 'Italia', 'Inglaterra', 'Francia', 'España');

-- 3. ELIMINADOS EN OCTAVOS (Jugaron 5 partidos en total y perdieron)
UPDATE equipos SET eliminado = true, partidos_jugados = 5 WHERE nombre IN ('Dinamarca', 'Croacia', 'Bélgica', 'Alemania', 'Venezuela', 'Uruguay', 'USA', 'Panamá');

-- 4. ELIMINADOS EN CUARTOS (Jugaron 6 partidos en total y perdieron)
UPDATE equipos SET eliminado = true, partidos_jugados = 6 WHERE nombre IN ('México', 'Jamaica', 'Ecuador', 'Costa Rica');

-- 5. ELIMINADOS EN SEMIFINALES (Jugaron 7 partidos en total y perdieron)
UPDATE equipos SET eliminado = true, partidos_jugados = 7 WHERE nombre IN ('Argentina', 'Canadá');

-- 6. EL SUBCAMPEÓN (Jugó 8 partidos y perdió la final)
UPDATE equipos SET eliminado = true, partidos_jugados = 8 WHERE nombre = 'Brasil';

-- 7. EL REY DEL MUNDO (Jugó 8 partidos y NUNCA fue eliminado)
UPDATE equipos SET eliminado = false, partidos_jugados = 8 WHERE nombre = 'Colombia';