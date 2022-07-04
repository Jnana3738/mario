import man-is-he-mega-glbml from './man-is-he-mega-glbml-22045.mp3'
import audio1 from 'mixkit-small-win-2020.wav'
import audio2 from 'man-is-he-mega-glbml-22045.mp3'
import spriteSheetRunRight from 'img/spriteRunRight.png'
import spriteSheetStandRight from 'img/spriteStandRight.png'
import spriteSheetRunLeft from 'img/spriteRunRight.png'
import spriteSheetStandLeft from 'img/spriteRunRight.png'
import block from 'img/block.png'
import platform from 'img/platform.png'
import platform1 from 'img/platformSmallTall.png'

const canvas = document.querySelector('canvas');

const c = canvas.getContext('2d');

canvas.width = 1324
canvas.height = 628

class Player{
    constructor(){
        this.position = {
            x: 100,
            y: 500
        }
        this.width = 50,
        this.height = 50
    }

    draw() {
        c.fillStyle = 'red'
        c.fillRect(this.position.x, this.position.y, this.width, this.height)
    }
}

const player = new Player()
player.draw()