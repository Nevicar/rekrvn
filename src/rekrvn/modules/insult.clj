(ns rekrvn.modules.insult
  (:require [rekrvn.hub :as hub]))

(def modName "insult")

(def a ["artless" "bawdy" "beslubbering" "bootless" "churlish" "cockered" "clouted" "craven" "currish" "dankish" "dissembling" "droning" "errant" "fawning" "fobbing" "froward" "frothy" "gleeking" "goatish" "gorbellied" "impertinent" "infectious" "jarring" "loggerhead" "lumpish" "mammering" "mangled" "mewling" "paunchy" "pribbling" "puking" "puny" "squalling" "rank" "reeky" "rougish" "ruttish" "saucy" "spleeny" "spongy" "surly" "tottering" "unmuzzled" "vain" "venomed" "villainous" "warped" "wayward" "weedy" "yeasty"])
(def b ["base-court" "bat-fowling" "beef-witted" "beetle-headed" "boil-brained" "clapper-clawed" "clay-brained" "common-kissing" "crook-pated" "dismal-dreaming" "dizzy-eyed" "doghearted" "dread-bolted" "earth-vexing" "elf-skinned" "fat-kidneyed" "fen-sucked" "flap-mouthed" "fly-bitten" "folly-fallen" "fool-born" "full-gorged" "guts-griping" "half-faced" "hasty-witted" "hedge-born" "hell-hated" "idle-headed" "ill-breeding" "ill-nurtured" "knotty-pated" "milk-livered" "motley-minded" "onion-eyed" "plume    -plucked" "pottle-deep" "pox-marked" "reeling-ripe" "rough-hewn" "rude-growing" "rump-fed" "shard-borne" "sheep-biting" "spur-galled" "swag-bellied" "tardy-gaited" "tickle-brained" "toad-spotted" "unchin-snouted" "weather-bitten"])
(def c ["apple-john" "baggage" "barnacle" "bladder" "boar-pig" "bugbear" "bum-bailey" "canker-blossom" "clack-dish" "clotpole" "coxcomb" "codpiece" "death-token" "dewberry" "flap-dragon" "flax-wench" "flirt-gill" "foot-licker" "fustilarian" "giglet" "gudgeon" "haggard" "harpy" "hedge-pig" "horn-beast" "huggerpmugger" "joithead" "lewdster" "lout" "maggot-pie" "malt-worm" "mammet" "measle" "minnow" "miscreant" "moldwarp" "mumble-news" "nut-hook" "pidgeon-egg" "pignut" "puttock" "pumpion" "ratsbane" "scut" "skainsmate" "strumpet" "varlot" "vassal" "whey-faced" "wagtail"])

(defn make-insult [[nick target] reply]
  (let [rand-insult (clojure.string/join " " (map rand-nth [a b c]))]
    (reply modName (str (or target nick) ", thou " rand-insult "!"))))

(hub/addListener modName #"^irc :(\S+)!\S+ PRIVMSG \S+ :\.(?:insult|burne)(?: (.*\S))?\s*$" make-insult)

