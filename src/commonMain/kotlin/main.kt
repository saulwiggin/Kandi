import com.soywiz.klock.seconds
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
}