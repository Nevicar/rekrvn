(ns rekrvn.modules.rimshot
  (:require [rekrvn.hub :as hub]))

(def modName "rimshot")

;(def rimShot "http://instantrimshot.com/")
(def rimShot "http://i.imgur.com/BbgL7x3.gif")
(def trombone "http://sadtrombone.com")
(def khan "http://www.khaaan.com/")
(def snowman "☃")
(def tableflip (if (< (rand) 0.75) "(╯°□°)╯︵ ┻━┻" "┬─┬ノ(º_ºノ)"))
(def surf "🌊🏄")
(def corn "🌽")
(def siren "🚨🚨🚨🚨")
(def clap "👏👏👏👏")

(hub/addListener modName #"^irc.*PRIVMSG \S+ :(\.(?:instant)?rimshot)$" (fn [_ refn] (refn modName rimShot)))
(hub/addListener modName #"^irc.*PRIVMSG \S+ :(\.(?:sad)?trombone)$" (fn [_ refn] (refn modName trombone)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.kha+n)$" (fn [_ refn] (refn modName khan)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.snowman)$" (fn [_ refn] (refn modName snowman)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.flip)$" (fn [_ refn] (refn modName tableflip)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.surf)$" (fn [_ refn] (refn modName surf)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.corn)$" (fn [_ refn] (refn modName corn)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.siren)$" (fn [_ refn] (refn modName siren)))
(hub/addListener modName #"(?i)^irc.*PRIVMSG \S+ :(\.clap)$" (fn [_ refn] (refn modName clap)))
