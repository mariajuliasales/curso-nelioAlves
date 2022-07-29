const urlMaca =
  'https://upload.wikimedia.org/wikipedia/commons/thumb/1/15/Red_Apple.jpg/280px-Red_Apple.jpg'

const urlPera =
  'https://static9.depositphotos.com/1642482/1148/i/450/depositphotos_11489464-stock-photo-pears.jpg'

const urlUva =
  'https://d3ugyf2ht6aenh.cloudfront.net/stores/746/397/products/uva-brs-isis-sem-semente1-4117fb3e4898b50a5a16102264065112-1024-1024.jpg'

document.querySelector('#root').innerHTML = `
  <img src="${urlMaca}" alt="foto de uma maça">
  <button id="button">Alterar fruta</button> 
`

function alterarFruta() {
  const imagem = [urlMaca, urlPera, urlUva]
  const altImagem = ['maça', 'pera', 'uva']
  let imagemAtual = document.querySelector('img').getAttribute('src')

  for (i = 0; i < imagem.length; i++) {
    if (imagem[i] == imagemAtual) {
      if (i == imagem.length - 1) {
        imagemAtual = imagem[0]
        document
          .querySelector('img')
          .setAttribute('alt', 'foto de uma ' + altImagem[0])
        console.log(document.querySelector('img').getAttribute('alt'))
        break
      }
      imagemAtual = imagem[i + 1]
      document
        .querySelector('img')
        .setAttribute('alt', 'foto de uma ' + altImagem[i + 1])
      console.log(document.querySelector('img').getAttribute('alt'))
      break
    }
  }
  document.querySelector('img').setAttribute('src', imagemAtual)
}

document.querySelector('#button').addEventListener('click', alterarFruta)
