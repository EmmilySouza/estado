UPDATE alunos
SET 
    cidade = CASE ID
        WHEN 7 THEN 'Canelinha'
        WHEN 24 THEN 'Canelinha'
        WHEN 10 THEN 'Canelinha'
        WHEN 11 THEN 'Canelinha'
        WHEN 14 THEN 'Canelinha'
        ELSE cidade
    END,
    Estado = CASE ID
        WHEN 7 THEN 'SC'
        WHEN 24 THEN 'SC'
        WHEN 10 THEN 'SC'
        WHEN 11 THEN 'SC'
        WHEN 14 THEN 'SC'
        ELSE Estado
    END
WHERE ID IN (7, 24, 10, 11, 14);
