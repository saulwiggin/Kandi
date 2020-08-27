import com.soywiz.klock.seconds
import com.soywiz.korev.*
import com.soywiz.korge.*
import com.soywiz.korge.resources.*
import com.soywiz.korge.tween.*
import com.soywiz.korge.view.*
import com.soywiz.korim.color.Colors
import com.soywiz.korim.format.*
import com.soywiz.korio.file.std.*
import com.soywiz.korma.geom.degrees
import com.soywiz.korma.interpolation.Easing

suspend fun main() = Korge(width = 512, height = 512, bgcolor = Colors["#2b2b2b"]) {
	val spriteMap = resource("normal_walk.png").readBitmap()

	val runningAnimation = SpriteAnimation(
			spriteMap = spriteMap,
			spriteWidth = 60,
			spriteHeight = 100,
			marginTop = 0,
			marginLeft = 0,
			columns = 2
	)

	val sprite = sprite(runningAnimation)

	sprite.playAnimationForDuration(5.seconds)

	val input = views.input

	addUpdater {
		sprite.x++
		val xy = input.mouse
		val buttons: Int = input.mouseButtons // input mouse buttons

	}

	var exit = false

	// input key press
	addHrUpdater { dt ->
		val scale = dt / 16
		if (input.keys[Key.LEFT]) moveLeft()
		if (input.keys[Key.RIGHT) moveRight()
		if (input.keys[Key.UP]) moveUp()
		if (input.keys[Key.DOWN]) moveDown()
		if (input.keys.justPressed(Key.E)) exit = true
		if (input.keys.justReleased(Key.ENTER)) fireWeapon("fire weapon")
	}

	mouse {
		click {
			fireWeapon()
		}
	}


}

fun fireWeapon(s: String) {
	sendText("weapon fired")
}

fun sendText(s: String) {
	print(s)
}

fun moveDown() {
	TODO("Not yet implemented")
}

fun moveUp() {
	TODO("Not yet implemented")
}

fun moveRight() {
	TODO("Not yet implemented")
}

fun moveLeft() {
	TODO("Not yet implemented")
}
