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
	val circle = circle(radius = 20.0, color = Colors.GREEN)
	val rect = solidRect(100.0, 100.0, color = Colors.YELLOW).xy(100, 100)

	val bitmap = resource("korge.png").readBitmap()
	val image = image(bitmap)
}