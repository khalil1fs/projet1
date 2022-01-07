#!/bin/bash

#BLACK='\033[0;30m'
RED='\033[0;31m'
GREEN='\033[0;32m'
ORANGE='\033[0;33m'
BLUE='\033[0;34m'
Lblue='\033[1;34m'
PURPLE='\033[0;35m'
CYAN='\033[0;36m'
GRAY='\033[0;37m'
YELLOW='\033[1;33m'
#WHITE='\033[1;37m'
Lgreen='\033[1;32m'


function clearScreen 
{

clear
echo -e "${Lgreen}"
cat << "EOF"
                         Advanced Calculator             
_____________________________________________________________________
|1) Addition            |2) soustraction      |3) division           |
|_______________________|_____________________|______________________|
|4) Multiplication      |5) Factorielle       |6) puissance          |
|_______________________|_____________________|______________________|
|7) decimal to binaire  |8) binaire to decimal|9) octal to decimal   |
|_______________________|_____________________|______________________|
|10) decimal to octal   |11) decimal to hexa  |12) hexa to decimal   |
|_______________________|_____________________|______________________|
|13) random             |14) valeur absolue   |15) Carre             |
|_______________________|_____________________|______________________|
|16) reste de division  |17) Racine caree     |18) X^-1              | 
|_______________________|_____________________|______________________|

EOF
echo -e "${YELLOW}enjoy :)"
echo -e "${RED}exit:0 | clear:99"
}
clearScreen
function somme
{
echo -e "${Lblue}        Somme  "
echo -en "${CYAN}le premier nombre: " 
read nombre1
echo -en "${CYAN}le deusieme nombre: " 
read nombre2

echo -en "${BLUE}le resultat est : "
echo `bc <<< $nombre1+$nombre2`
}

function difference
{
echo -e "${Lblue}        Difference  "
echo -en "${CYAN}le premier nombre: " 
read nombre1
echo -en "${CYAN}le deusieme nombre: " 
read nombre2
echo -en "${BLUE}le resultat est : "
echo -e `bc <<< $nombre1-$nombre2`
}

function division
{
echo -e "${Lblue}        Division  "
echo -en "${CYAN}le premier nombre: " 
read nombre1
echo -en "${CYAN}le deusieme nombre: " 
read nombre2

echo -en "${BLUE}le resultat est : "
echo -e `bc <<< $nombre1/$nombre2`
}

function Multiplication
{
echo -e "${Lblue}     Multiplication  "
echo -en "${CYAN}le premier nombre: " 
read nombre1
echo -en "${CYAN}le deusieme nombre: " 
read nombre2

echo -en "${BLUE}le resultat est : "
echo -e `bc <<< $nombre1*$nombre2`

}

function Factorielle 
{
echo -e "${Lblue}       Factorielle  "
echo -ne "${CYAN}Donner un nombre: " 
read nombre1

resultat=1;
if (( nombre1 >= 0 )); 
then
for((i=$nombre1;i>=1;i--)); do
  resultat=$((resultat*i)) 
done	
echo -e "${BLUE}le resultat est: $resultat"
else 
echo -e "${RED}essayer avec un nombre possitif "
Factorielle
fi
}

function power
{
echo -e "${Lblue}      Puissance  "
echo -en "${CYAN}entrer un nombre: " 
read nombre1
echo -en "${CYAN}entrer sa puissance: "
read nombre2

resultat=1;
if (( nombre1 >= 0 ));
then
for((i=1;i<=$nombre2;i++)); do
  resultat=$((resultat*nombre1))
done
echo -e "${BLUE}le resultat est: $resultat"
else
echo -e "${RED}essayer avec un entier possitif"
power
fi
}
function toBinaire
{
echo -e "${Lblue}      Conversion a binaire  "
echo -e "${CYAN}Entrer un nombre decimal: "
read nombre1
echo -en "${BLUE} en Binaire est: "
bc <<< "obase=2;$nombre1"
}

function toDecimal
{
  echo -e "${Lblue}    Conversion de Binaire a Decimal  "	
  echo -en "${CYAN}Entrer un Binaire: "
  read nombre1
  echo -e " en Decimal est: ${BLUE} $((2#$nombre1))"
}

function octalToDecimal 
{
echo -e "${Lblue}       Conversion de l'Octal a Decimal  "
echo -en "${CYAN}Entrer un octal: "
read nombre1	
echo -e "en Decimal ${BLUE} $((8#$nombre1))"
}

function DecimalToOctal
{
echo -e "${Lblue}       Conversion de Decimal a l'Octal   "
echo -en "${CYAN}Saisir un Decimal: "
read nombre1
echo -en "${BLUE}en Octal est " 
echo -e "obase=8; ibase=10; $nombre1" | bc
}

function DecimalToHexa
{
echo -e "${Lblue}       Conversion de Decimal a HexaDecimal  "
echo -en "${CYAN}Saisir un Decimal: "
read nombre1
echo -en "${BLUE}en HexaDecimal est " 
echo -e "obase=16; ibase=10; $nombre1" | bc
}

function HexaToDecimal
{
echo -e "${Lblue}       Conversion de HexaDecimal to Decimal "
echo -en "${CYAN}Saisir un HexaDecimal: "
read nombre1
echo -en "${BLUE}en Decimal est " 
echo -e "$((16#$nombre1))"
}

function random
{
echo -e "${Lblue}     Nombre Aleatoire  "
echo -en "${CYAN}entrer d'intervalle du random"
read nombre1
echo -e "${BLUE}le random est: $(($RANDOM%nombre1))"
}

function absolue
{
echo -e "${Lblue}       Valeur Absolue  "
echo -en "${CYAN}Entrer un nombre: "
read nombre1
if (( nombre1 < 0)); then
nombre1=$((nombre1*-1))
echo -e "${BLUE}la valeur absolue est: $nombre1 "
else
echo -e "${BLUE}la valeur absolue est: $nombre1 "
fi
}

function carre
{
echo -e "${Lblue}      le Carre d'un nombre  "
echo -e "${CYAN}Entrer un nombre: "
read nombre1
echo -e "${BLUE}le carre est $((nombre1*nombre1))"
}

function reste
{
echo -e "${Lblue}      le Reste de Division "
echo -en "${CYAN}Entrer le nombre1: "
read nombre1
echo -en "${CYAN}Entrer le nombre2: "
read nombre2
echo -e "${BLUE}le reste est  $((nombre1%nombre2))"
}
function racine
{
echo -e "${Lblue}      le Racine carree "
echo -en "${CYAN}Entrer le nombre1: "
read nombre1
echo -en "${BLUE}le resultat est: "
bc -l <<<"(sqrt($nombre1))"
}
function qrt
{
echo -e "${Lblue}      l'Inverse "
echo -en "${CYAN}Entrer le nombre1: "
read nombre1
echo -en "${BLUE}le resultat est: "
bc -l <<<"1/$nombre1"
}
while true; do
echo -en "${Lblue}                        - Entrer une Commande: "
read operation

case $operation in
    0) echo -e "${PURPLE}By ;)"
	sleep 1    
        clear
        exit 
      ;;	
    1) somme
      ;;
    2) difference
      ;;
    3) division    
      ;;
    4) Multiplication
      ;;
    5) Factorielle
      ;;
    6) power
      ;;
    7) toBinaire
      ;;
    8) toDecimal
      ;;
    9) octalToDecimal
      ;;
    10) DecimalToOctal
      ;;
    11) DecimalToHexa
      ;;
    12) HexaToDecimal
      ;;
    13) random
      ;;
    14) absolue
      ;;	    
    15) carre
      ;;
    16) reste
      ;;
    17) racine
      ;;	  
    18) qrt
      ;;	
    99) clearScreen
      ;;
    *) echo -e "${RED}         Essayer une nouvelle fois avec un nombre valide ;) "
      ;;
esac
#echo -e "${YELLOW}pour vider le screen entrer 99"
sleep 1
done
