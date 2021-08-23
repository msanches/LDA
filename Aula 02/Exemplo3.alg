algoritmo imc
	inteiro peso, altura, imc
	inicio
		escreva("Digite o seu peso em kg: ")
		leia(peso)
		escreva("Digite a sua altura em m: ")
		leia(altura)
		imc = peso / (altura*altura)
		escreva("O seu IMC é: " + imc + "kg/m²")
	fim 
	
	