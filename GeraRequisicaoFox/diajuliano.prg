parameters mano, mdia

SET DATE BRITISH

local mdata as date
LOCAL dataFormatada AS CHAR

&&CONVERTE O ANO EM DATA
mdata = ctod('01/01/'+mano)

&&CONVERTE O JULIANO + O ANO EM DATA NO FORMATO COMPLETO E CONVERTE EM STRING
dataFormatada = TTOC(mdata+(mdia-1))

&&RETIRA AS BARRAS
dataFormatada = STRTRAN(dataFormatada,"/","")

&&PEGA APENAS A DATA NO FORMATO DDMMYYYY
dataFormatada = SUBSTR(dataFormatada,1,8)


RETURN dataFormatada