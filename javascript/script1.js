/*
  Alterar o innerHTML:

  document.querySelector("...")   
  document.getElementById("...")
  document.getElementsByClassName("...")    // retorna um array
*/

document.querySelector('#root').innerHTML = `
<div id="primeiro" >Hello World</div>
  <div class="segundo"></div>
  <div></div>
  <button>Alterar cor</button> 
  <button>Apagar cor</button> 
  `

document.getElementById('primeiro').innerHTML = 'Primeira div'

document.getElementsByClassName('segundo')[0].innerHTML = 'Seguda div'

document.getElementsByTagName('div')[3].innerHTML = 'Terceira div'

function alterarCor() {
  if (document.querySelector('#primeiro').classList.contains('verde')) {
    document.querySelector('#primeiro').classList.remove('verde')
    document.querySelector('#primeiro').classList.add('vermelho')
    document.getElementsByTagName('div')[3].classList.remove('verde')
    document.getElementsByTagName('div')[3].classList.add('vermelho')
    document.querySelector('.segundo').classList.remove('vermelho')
    document.querySelector('.segundo').classList.add('verde')
  } else {
    document.querySelector('#primeiro').classList.remove('vermelho')
    document.querySelector('#primeiro').classList.add('verde')
    document.querySelector('.segundo').classList.remove('verde')
    document.querySelector('.segundo').classList.add('vermelho')
    document.getElementsByTagName('div')[3].classList.remove('vermelho')
    document.getElementsByTagName('div')[3].classList.add('verde')
  }
}

document.querySelector('button').addEventListener('click', alterarCor)

function limparBackground() {
  if (document.querySelector('#primeiro').classList.contains('verde')) {
    document.querySelector('#primeiro').classList.remove('verde')
    document.querySelector('.segundo').classList.remove('vermelho')
    document.getElementsByTagName('div')[3].classList.remove('verde')
  } else {
    document.querySelector('#primeiro').classList.remove('vermelho')
    document.querySelector('.segundo').classList.remove('verde')
    document.getElementsByTagName('div')[3].classList.remove('vermelho')
  }
}

document
  .getElementsByTagName('button')[1]
  .addEventListener('click', limparBackground)
